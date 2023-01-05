package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CatInTheHat {
    
    public static void main (String[] args) {

        //Read the file
        Path cithPath = Paths.get("./cat_in_the_hat.txt");
        File cith = cithPath.toFile();

        try {

            //Open a file
            InputStream is = new FileInputStream(cith);
            OutputStream os = new FileOutputStream("copy_of_the_cat_in_the_hat.txt");
            byte [] buffer = new byte[512]; //4k buffer

            int size = is.read(buffer);
            //size == -1 at end of file...
            
            while (size >= 0) {
                System.out.printf("size: %d\n", size);
                os.write (buffer, 0, size);
                size = is.read(buffer);
            }

            //Close a file
            is.close();

            //close the output stream
            os.flush();
            os.close();

        } catch (FileNotFoundException ex) {

            System.err.printf("IO exception: %s\n", ex.getMessage());

        } catch (IOException ex) {
            System.err.printf("IO exception: %s\n", ex.getMessage());

        }
    }
}

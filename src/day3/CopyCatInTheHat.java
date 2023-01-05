package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyCatInTheHat {

    public static void main (String[] args) throws IOException {

          //Read the file
          Path cithPath = Paths.get("./copy_of_the_cat_in_the_hat.txt");
          File cith = cithPath.toFile();

          if (!cith.exists()) {
            System.err.println("File cannot be found");
            System.exit(1);
          }

          FileReader fr = new FileReader(cith);
          BufferedReader br = new BufferedReader (fr);

          FileWriter writer = new FileWriter("more.txt");
          String line;

          while (null != (line = br.readLine())) {
              writer.write (line.toUpperCase());
              writer.write ("\n");
          }

          // close the reader
          br.close();
          fr.close();

          // close the writer
          writer.flush();
          writer.close();

    }
    
}

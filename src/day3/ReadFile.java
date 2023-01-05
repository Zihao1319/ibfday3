package day3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

    public static void main (String [] args) {

        // get the path
        Path cithPath = Paths.get (args[0]);
        System.out.printf("the file name: %s\n", cithPath);

        
        File cith = cithPath.toFile();
        System.out.printf("is directory: %b\n", cith.isDirectory());
        System.out.printf("is file: %b\n", cith.isFile());

        if (cith.isDirectory()) {
            File [] files = cith.listFiles();
            System.out.printf("Content of directory: %s\n", cith.getName());

            for (File i: files) {
                System.out.println("File names: " + i.getName());
            }

        } else {
            System.out.printf("file size: %d\n", cith.length());
            System.out.printf("file name: %s\n", cith.getName());

        }


    }
}
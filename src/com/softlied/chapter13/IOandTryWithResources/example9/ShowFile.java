package com.softlied.chapter13.IOandTryWithResources.example9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    This version of the ShowFile program uses a try-with-resources
    statement to automatically close a file after it is no longer needed
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;

        //First confirm that a filename has been specified
        if (args.length != 1) {
            System.out.println("Usage: java ShowFile");
            return;
        }

        // The following code uses a try-with-resources statement to open
        // a file and then automatically close it when the try block is left
        try (FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            }while (i != -1);
        }catch (FileNotFoundException ex){
            System.out.println("File Not Found");
        } catch (IOException ex){
            System.out.println("An I/O error occurred");
        }
    }
}

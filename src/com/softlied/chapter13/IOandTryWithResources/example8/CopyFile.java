package com.softlied.chapter13.IOandTryWithResources.example8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;

/*
    Copy a file.
    To use this program, specify the name
    of the source file and the declaration file.
    For example, to copy a file called FIRST.TXT
    to a file SECOND.TXT, use the following
    command line
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //First, confirm that both files have been specified
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        //Copy a File
        try {
            //Attempt to open the files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }while (i != -1);
        } catch (IOException ex){
            try{
                if (fin != null) fin.close();
            }catch (IOException e2){
                System.out.println("Error closing Input File");
            }

            try {
                if (fout != null) fout.close();
            }catch (IOException e2){
                System.out.println("Error closing Output File");
            }
        }
    }
}

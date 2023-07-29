package com.softlied.chapter10.ExceptionHandling.example10;

import java.sql.SQLOutput;

//Demonstrate finally
public class FinallyDemo {
    //Throw an exception out of method
    static void procA(){
        try{
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA finally");
        }
    }

    //Return from within a try block
    static void procB(){
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("procB finally");
        }
    }

    //Execute a try block normally
    static void procC(){
        try{
            System.out.println("Inside procC");
        } finally {
            System.out.println("Proc's finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception ex){
            System.out.println("Exception Caught");
        }

        procB();
        procC();
    }
}

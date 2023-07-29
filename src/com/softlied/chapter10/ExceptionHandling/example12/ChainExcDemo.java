package com.softlied.chapter10.ExceptionHandling.example12;

//Demonstrate exception chaining
public class ChainExcDemo {
    static void demoproc(){
        //create an exception
        NullPointerException e = new NullPointerException("top Layer");

        //add a cause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException ex){
            System.out.println("Caught: " + ex);

            //display cause exception
            System.out.println("Original cause: " + ex.getCause());
        }
    }
}

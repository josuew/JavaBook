package com.softlied.chapter10.ExceptionHandling.example8;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("demo");
        }catch (NullPointerException ex){
            System.out.println("Caught inside demoproc");
            throw ex;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught: " + e);
        }
    }
}

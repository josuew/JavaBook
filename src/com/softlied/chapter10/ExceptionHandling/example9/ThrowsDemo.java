package com.softlied.chapter10.ExceptionHandling.example9;

import java.sql.SQLOutput;

public class ThrowsDemo {
    static void throwsOne() throws IllegalAccessException{
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try{
            throwsOne();
        }catch (IllegalAccessException ex){
            System.out.println("Caught: " + ex);
        }
    }
}

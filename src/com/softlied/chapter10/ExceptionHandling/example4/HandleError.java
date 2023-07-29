package com.softlied.chapter10.ExceptionHandling.example4;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random random = new Random();

        for(int i = 0; i < 32000; i++){
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b/c);
            }catch (ArithmeticException e){
                System.out.println("Division By Zero");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}

package com.softlied.chapter10.ExceptionHandling.example5;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("A = " + a);
            int b = 42 /a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException ex){
            System.out.println("Divide by 0: " + ex);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array index oob: " + ex);
        }
        System.out.println("After try/catch blocks");
    }
}

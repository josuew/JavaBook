package com.softlied.chapter15.Lambda.example5;

//A block lambda that reverses the characters in a String
interface StringFunc{
    String func(String n);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        //This block lambda reverses the characters in a String
        StringFunc reverse = (str)->{
            String result = "";
            int i;

            for (i = str.length() -1; i>= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));
    }
}

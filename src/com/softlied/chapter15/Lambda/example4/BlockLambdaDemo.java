package com.softlied.chapter15.Lambda.example4;

import org.w3c.dom.ls.LSOutput;

// A block lambda that computes the factorial of an int value
interface NumericFunc{
    int func(int n);
}
public class BlockLambdaDemo {
    public static void main(String[] args) {
        //This block lambda computes the factorial of an int value
        NumericFunc numericFunc = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("The factorial of 3 is " + numericFunc.func(3));
        System.out.println("The factorial of 5 is " + numericFunc.func(5));
    }
}

package com.softlied.chapter15.Lambda.example3;

//Demonstrate a lambda expression that takes two parameters
interface NumericTest2{
    boolean test(int n, int d);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        //This lambda expression determines if one number is
        // a factor or another
        NumericTest2 isFactor = (n,d) -> (n % d ) == 0;

        if (isFactor.test(10,2))
            System.out.println("2 is a factor of 10");

        if (!isFactor.test(10,3))
            System.out.println("3 is not a factor of 10");
    }
}

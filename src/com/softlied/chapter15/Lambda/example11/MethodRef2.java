package com.softlied.chapter15.Lambda.example11;

//Demonstrate a method reference to an instance method

//A functional interface for String Operations
interface StringFunc{
    String func(String n);
}

// Now, this class defines an instance method called strReverse()
class MyStringOps{
    String strReverse(String str){
        String result = "";
        int i;

        for (i = str.length() -1; i>= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class MethodRef2 {
    //This method has a functional interface as the type of
    // its first parameter. Thus, it can be passed any instance
    // of that interface, including method references
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        //Create a MyStringOps object
        MyStringOps stringOps = new MyStringOps();

        //Now, a method reference to the instance method strReverse
        // is passed to stringOp
        outStr = stringOp(stringOps::strReverse, inStr);

        System.out.println("Original String: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}

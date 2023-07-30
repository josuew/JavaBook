package com.softlied.chapter15.Lambda.example10;

//Demonstrate a method reference for a static method
//a functional interface for String operations
interface StringFunc{
    String func(String n);
}

//This class defines a static method called strReverse()
class MyStringOps{
    //A static method that reverses a string
    static String strReverse(String str){
        String result = "";
        int i;

        for (i = str.length() -1; i>= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class MethodRefDemo {
    //This method has a functional interface as the type of
    // its first parameter. Thus it can be passed any instance
    // of that interface. Including a method reference
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        //Here, a method reference to strReverse is passed to stringop()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Original String: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}

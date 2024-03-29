package com.softlied.chapter8.Inheritance.example2;
/*
    In a class hierarchy, private members remain
    private to their class.
    This program contains an error and will not compile
 */

//Create a superclass
class A{
    int i; //default access
    private int j; // private to A

    void setIJ(int x, int y){
        i = x;
        j = y;
    }
}

//A's j is not accessible here
class B extends A{
    int total;

    void sum(){
//        total = i + j; ERROR, j is not accessible here

    }
}
public class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setIJ(10,12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}

package com.softlied.chapter8.Inheritance.example1;

//A simple example of Inheritance
class A{
    int i,j;

    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }
}

//Create a subclass by extending class A
class B extends A{
    int k;

    void showk(){
        System.out.println("k: " + k);
    }

    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //The subclass has access to all public members of its superclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        subOb.sum();

    }
}

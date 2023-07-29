package com.softlied.chapter8.Inheritance.example11;

// Dynamic Method Dispatch
class A{
    void callMe(){
        System.out.println("Inside A's callMe method");
    }
}

class B extends A{
    void callMe(){
        System.out.println("Inside B's callMe method");
    }
}

class C extends A{
    void callMe(){
        System.out.println("Inside C's callMe method");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; // obtain a reference of type A

        r = a; // r refers to an A object
        r.callMe(); // calls A's version of callMe

        r = b; // r refers to B object
        r.callMe(); // calls B's version of callMe

        r = c; // r refers to C object
        r.callMe(); // calls C's version of callMe
    }
}

package com.softlied.chapter8.Inheritance.example15;

class A{
    final void meth(){
        System.out.println("This is a final method");
    }
}

class B extends A{
//    void meth(){
//      System.out.println("ilegal!");
//    }
}
public class PreventOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth();
    }
}

package com.softlied.chapter8.Inheritance.example8;

class A{
    int i,j;

    A(int a, int b){
        i = a;
        j = b;
    }

    //display i j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A{
    int k;

    B(int a, int b, int c){
        super(a,b);
        k = c;
    }

    //display k - this overrides show() in A
    void show(){
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show();
    }
}

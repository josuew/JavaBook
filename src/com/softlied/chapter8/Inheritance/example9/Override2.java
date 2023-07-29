package com.softlied.chapter8.Inheritance.example9;

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    //display i j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //display k - this overrides show() in A
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override2 {
    public static void main(String[] args) {
        B b = new B(1,2,3);
        b.show();
    }
}

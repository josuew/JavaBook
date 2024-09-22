package com.softlied.chapter13.IOandTryWithResources.example11;

// Demonstrate instance of operator
class A{
    int i, j;
}

class B extends A{
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("a is instance of A");
        if (b instanceof B)
            System.out.println("b is instance of B");
        if (c instanceof A)
            System.out.println("c is instance of A");
        if (a instanceof C)
            System.out.println("a is instance of C");

        System.out.println();

        //Compare type of derived types
        A ob;
        ob = d; // A reference to d
        System.out.println("ob now refers to d");
        if (ob instanceof D)
            System.out.println("ob is instance of D");

        System.out.println();
        ob = c; // A reference to C
        System.out.println("ob now refers to c");

        if (ob instanceof D)
            System.out.println("ob is instance of D");
        else System.out.println("ob cannot be cast to D");

        if (ob instanceof A)
            System.out.println("ob can be cast to A");

        System.out.println();

        // All objects can be cast to Object
        if (a instanceof Object)
            System.out.println("a may be cast to Object");
        if (b instanceof Object)
            System.out.println("b may be cast to Object");
        if (c instanceof Object)
            System.out.println("c may be cast to Object");
        if (d instanceof Object)
            System.out.println("d may be cast to Object");

    }
}

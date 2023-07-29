package com.softlied.chapter9.PackagesAndInterfaces.example7;

//One interface can extend another
interface A{
    void meth1();
    void meth2();
}

//B now includes meth1() and meth2() -- it adds meth3
interface B extends A{
    void meth3();
}

//This class must implement all of A and B
class MyClass implements B{
    @Override
    public void meth1() {
        System.out.println("Implement meth1()");
    }

    @Override
    public void meth2() {
        System.out.println("Implement meth2()");
    }

    @Override
    public void meth3() {
        System.out.println("Implement meth3()");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

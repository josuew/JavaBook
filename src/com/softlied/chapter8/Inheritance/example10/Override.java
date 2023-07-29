package com.softlied.chapter8.Inheritance.example10;

//Methods differing type signatures are overloaded - not overridden
class A{
    int i,j;

    A(int a, int b){
        i = a;
        j = b;
    }

    //display i and j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

//Create a subclass by extending class A
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k = c;
    }

    //overload show()
    void show(String msg){
        System.out.println(msg + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show("This is k: ");
        subOb.show();
    }
}

package com.softlied.chapter14.Generics.example3;

// A simple generic with two type
// parameters: T and V
class TwoGen<T, V>{
    T ob1;
    V ob2;

    // Pass a constructor a reference to
    // an object of type T and an object of type V
    TwoGen(T o1, V o2){
        this.ob1 = o1;
        this.ob2 = o2;
    }

    // Show types of T and V
    void showTypes(){
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}

//Demonstrate TwoGen
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");

        //Show the types
        tgObj.showTypes();

        //Obtain and show values
        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}

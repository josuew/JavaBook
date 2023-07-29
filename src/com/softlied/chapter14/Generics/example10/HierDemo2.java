package com.softlied.chapter14.Generics.example10;

// A non-generic class can be the superclass
// of a generic subclass

// A non-generic class
class NonGen{
    int num;

    NonGen(int i){
        num = i;
    }

    int getNum(){
        return num;
    }
}

//A generic subclass
class Gen<T> extends NonGen{
    T ob; //declare an object of type T

    //Pass the constructor a reference to
    // an object of type T
    Gen(T o, int i){
        super(i);
        ob = o;
    }

    //Return ob
    T getOb(){
        return ob;
    }
}

//Create a Gen object
public class HierDemo2 {
    public static void main(String[] args) {
        //Create a Gen object for String
        Gen<String> w = new Gen<>("Hello", 4);

        System.out.println(w.getOb());
        System.out.println(w.getNum());
    }
}

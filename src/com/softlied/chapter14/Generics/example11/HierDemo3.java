package com.softlied.chapter14.Generics.example11;

//Use the instanceof operator with a generic class hierarchy
class Gen<T> {
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }
}

//A subclass of Gen
class Gen2<T> extends Gen<T>{
    Gen2(T t){
        super(t);
    }
}

//Demonstrate run-time type ID implications of generic
// class hierarchy
public class HierDemo3 {
    public static void main(String[] args) {
        //Create a Gen object for Integers
        Gen<Integer> iob = new Gen<>(88);

        //Create a Gen2 object for Integers
        Gen2<Integer> iob2 = new Gen2<>(99);

        //Create a Gen2 object for Strings
        Gen2<String> strOb2 = new Gen2<>("Generics Test");

        //See if ob2 is some form of Gen2
        if (iob2 instanceof Gen2<?>)
            System.out.println("iOb2 is instance of Gen2");

        if (iob2 instanceof Gen<?>)
            System.out.println("iob2 is instance of Gen");

        //See if strob2 is a Gen2
        if (strOb2 instanceof Gen2<?>)
            System.out.println("strOb2 is instance of Gen2");

        if (strOb2 instanceof Gen<?>)
            System.out.println("strOb2 is instance of Gen");

        if (iob instanceof Gen2<?>)
            System.out.println("iob is instance of Gen2");

        if (iob instanceof Gen<?>)
            System.out.println("iob is instance of Gen");
    }
}

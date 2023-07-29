package com.softlied.chapter14.Generics.example12;

//Overriding a generic method in a generic class
class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }

    T getOb(){
        System.out.println("Gen's getOb()");
        return ob;
    }
}
//A subclass of Gen that overrides getOb()
class Gen2<T> extends Gen<T>{
    Gen2(T o){
        super(o);
    }

    //override getOb()
    T getOb(){
        System.out.println("Gen2's getOb(): ");
        return ob;
    }
}

//Demonstrate generic method override
public class OverrideDemo {
    public static void main(String[] args) {
        //Create a Gen object for Integers
        Gen<Integer> iob = new Gen<>(88);

        //Create a Gen2 object for Integers
        Gen2<Integer> iob2 = new Gen2<>(99);

        //Create a Gen2 object for Strings
        Gen2<String> strOb2 = new Gen2<>("Generics Test");

        System.out.println(iob.getOb());
        System.out.println(iob2.getOb());
        System.out.println(strOb2.getOb());
    }
}

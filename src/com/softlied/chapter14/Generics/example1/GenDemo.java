package com.softlied.chapter14.Generics.example1;

//A simple generic class
//Here, T is a type parameterized that
//will be replaced by a real type
//when an object of type Gen is created
class Gen<T>{
    T ob; // declare an object of type T

    //Pass the constructor a reference to
    Gen(T ob){
        this.ob = ob;
    }

    //Return ob
    T getOb(){
        return ob;
    }

    //Show type of T
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

//Demonstrate the generic class
public class GenDemo {
    public static void main(String[] args) {
        //Create a Gen reference for Integers
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its
        // reference to iOb. Notice that use of autoboxing
        // to encapsulate the value 88 within an Integer object
        iOb = new Gen<>(88);

        //Show the type of data used by iOb
        iOb.showType();

        //Get the value in iOb. Notice that
        // no cast is needed
        int v = iOb.getOb();

        //Create a Gen object for Strings
        Gen<String> strob = new Gen<>("Generics Test");

        //Show the type of data used by strOb
        strob.showType();

        //Get the value of strOb. Again, notice
        // that no cast is needed
        String str = strob.getOb();
        System.out.println("Value: " + str);
    }
}

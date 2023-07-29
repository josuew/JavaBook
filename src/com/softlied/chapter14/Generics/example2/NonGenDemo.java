package com.softlied.chapter14.Generics.example2;
//NonGen is functionality equivalent to Gen
//but does not use generics
class NonGen{
    Object ob; // ob is now of type Object

    //Pass the constructor a reference to
    //an object of type Object
    NonGen(Object ob){
        this.ob = ob;
    }

    //Return type Object
    Object getOb(){
        return ob;
    }

    //Show type ob
    void showType(){
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // Create NonGen object and store
        // an integer in it. Autoboxing still occurs
        iOb = new NonGen(88);

        //Show the type of data used by iOb
        iOb.showType();

        //Get the value of iOb
        //This time a cast is necessary
        int v = (Integer) iOb.getOb();
        System.out.println("Value: " + v);

        //Create another NonGen object and
        //store a String in it
        NonGen strOb = new NonGen("Non-Generics Test");

        //show the type of data used by strOb
        strOb.showType();

        //Get the value of strOb
        String str = (String) strOb.getOb();
        System.out.println("Value: " + str);

        //This compiles but is conceptually wrong
        iOb = strOb;
        v = (Integer) iOb.getOb();
    }
}

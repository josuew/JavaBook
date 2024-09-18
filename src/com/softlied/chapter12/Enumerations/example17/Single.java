package com.softlied.chapter12.Enumerations.example17;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// A single-member annotation needs to have value as member
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
    int value(); // this variable name must be value
}

public class Single {

    //Annotate a method using a single-member annotation
    @MySingle(100)
    public static void myMeth(){
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        }catch (NoSuchMethodException ex) {
            System.out.println("Method not found");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}

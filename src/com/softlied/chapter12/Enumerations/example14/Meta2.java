package com.softlied.chapter12.Enumerations.example14;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Show all annotations for a class and a method
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth(){
        Meta2 ob = new Meta2();

        try{
            Annotation[] annos = ob.getClass().getAnnotations();

            //Display all annotations for Meta2
            System.out.println("All annotations for Meta 2:");
            for (Annotation a : annos)
                System.out.println(a);

            System.out.println();

            // Display all annotations for myMeth
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All annotations for myMeth:");
            for (Annotation a : annos)
                System.out.println(a);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}

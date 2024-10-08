package com.softlied.chapter12.Enumerations.example12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//An annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

public class Meta {

    //Annotate a method
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth(){
        Meta ob = new Meta();

        // Obtain the annotation for this method
        // and display the values of the members
        try{
            //First, get a Class object that represents
            // this class
            Class<?> c = ob.getClass();

            //Now, get a Method object that represents
            // this method
            Method m = c.getMethod("myMeth");

            // Next, get the annotation for this class
            MyAnno anno = m.getAnnotation(MyAnno.class);

            //Finally, display the values
            System.out.println(anno.str() + " " + anno.val());

        }catch (NoSuchMethodException ex){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}

package com.softlied.chapter12.Enumerations.example15;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// An annotation type declaration that includes defaults
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str() default "Testing";
    int val() default 9000;
}

public class Meta3 {

    //Annotate a method using the default values
    @MyAnno()
    public static void myMeth(){
        Meta3 ob = new Meta3();

        // Obtain the annotation using the default values
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());

        }catch (NoSuchMethodException ex){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}

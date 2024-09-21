package com.softlied.chapter12.Enumerations.example19;

//Demonstrate a repeated annotation

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno{
    String str() default "Testing";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
    MyAnno[] value();
}

public class RepeatAnno {

    // Repeat MyAnno on myMeth()
    @MyAnno(str = "First annotation", val = -1)
    @MyAnno(str = "Second Annotation", val = 100)
    public static void myMeth(String string, int i){
        RepeatAnno ob = new RepeatAnno();
        try{
            Class<?> c = ob.getClass();

            //Obtain the annotations for myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            //Display the repeated MyAnno annotations
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);

        }catch (NoSuchMethodException ex){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}

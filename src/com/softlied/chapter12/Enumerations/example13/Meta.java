package com.softlied.chapter12.Enumerations.example13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

public class Meta {

    // myMeth now has two arguments
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i){
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            // Here, the parameter types are specified
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException ex){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}

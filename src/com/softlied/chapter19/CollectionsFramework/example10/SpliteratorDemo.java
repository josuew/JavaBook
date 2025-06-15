package com.softlied.chapter19.CollectionsFramework.example10;

import java.util.ArrayList;
import java.util.Spliterator;

//A simple Spliterator demonstration
public class SpliteratorDemo {
    public static void main(String[] args) {
        //Create an array list for doubles
        ArrayList<Double> vals = new ArrayList<>();

        //Add values to the array list
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //Use tryAdvance() to display contents of vals
        System.out.println("Contents of vals: " + vals);
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance(System.out::println));

        //Create a new list that contains square roots
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) ->  sqrs.add(Math.sqrt(n))));

        //Use forEachRemaining() to display contents of sqrs
        System.out.println("Contents of sqrs: " + sqrs);
        spltitr = vals.spliterator();
        spltitr.forEachRemaining(System.out::println);
    }
}

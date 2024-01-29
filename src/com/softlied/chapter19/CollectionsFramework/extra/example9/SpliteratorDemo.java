package com.softlied.chapter19.CollectionsFramework.extra.example9;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        //Create an array list for doubles
        ArrayList<Double> vals = new ArrayList<>();

        //Add values to the arraylist
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Use tryAdvance() to display contents of vals
        System.out.println("Contents of vals: ");
        Spliterator<Double> spltr = vals.spliterator();
        while (spltr.tryAdvance(System.out::println));

        //Create new list that contains square roots
        spltr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        //Use forEachRemaining() to display contents of sqrs
        System.out.println("Contents of sqrs: \n");
        spltr = sqrs.spliterator();
        spltr.forEachRemaining(System.out::println);


    }
}

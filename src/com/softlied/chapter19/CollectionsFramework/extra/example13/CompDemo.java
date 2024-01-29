package com.softlied.chapter19.CollectionsFramework.extra.example13;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o2.compareTo(o1));
        System.out.println();
        //Reverse the comparison
        return o2.compareTo(o1);
    }
}

public class CompDemo{
    public static void main(String[] args) {
        //Create a treeset
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        //Add elements to the treeset
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //Display The Elements
        for (String element : ts)
            System.out.println(element + " ");

    }
}

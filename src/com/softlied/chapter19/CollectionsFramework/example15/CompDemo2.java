package com.softlied.chapter19.CollectionsFramework.example15;


import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {

        //Pass a reverse comparator to a TreeSet() via a
        //lambda expression
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        //Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Display the elements
        for (String element : ts) {
            System.out.print(element);
        }
        System.out.println();
    }
}

package com.softlied.chapter19.CollectionsFramework.example14;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String>{
    public int compare(String aStr, String bStr){
        //Reverse the comparison
        return bStr.compareTo(aStr);
    }
}

public class CompDemo {
    public static void main(String[] args) {
        //Create a tree set
        TreeSet<String> ts = new TreeSet<>(new MyComp());

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

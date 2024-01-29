package com.softlied.chapter19.CollectionsFramework.example6;

import java.util.TreeSet;

//Demonstrate TreeSet
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        //Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);

        System.out.println(ts.subSet("C","F"));
    }
}

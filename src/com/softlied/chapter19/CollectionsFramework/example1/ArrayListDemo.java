package com.softlied.chapter19.CollectionsFramework.example1;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        //Create an array list
        ArrayList<String> a1 = new ArrayList<>();
        System.out.println("Initial size of a1: " + a1.size());
        a1.ensureCapacity(11);

        //Add elements to the arraylist
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("a1: " + a1);
        System.out.println("Size of a1 after additions: " + a1.size());

        //Display the arraylist
        System.out.println("Contents of a1:" + a1);

        //Remove elements
        a1.remove("F");
        a1.remove(2);

        System.out.println("Size of a1 after deletions: " + a1.size());
        System.out.println("Contents of a1: " + a1);

    }
}

package com.softlied.chapter19.CollectionsFramework.example17;

//Use thenComparing() to sort by last, then first name

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// A comparator that compares by last names.
class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j;

        //Find index of beginning of last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

//Sort by entire name when last names are equal
class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        return aStr.compareToIgnoreCase(bStr);
    }
}

public class TreeMapDemo2A {
    public static void main(String[] args) {
        // Use thenComparing() to create a comparator that compares
        // last names, then compares entire name when last names match
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        //Create a tree map
        TreeMap<String, Double> treeMap = new TreeMap<>(compLastThenFirst);

        //Put elements in the map
        treeMap.put("John Doe", 3434.34);
        treeMap.put("Tom Smith", 123.22);
        treeMap.put("Jane Baker", 1378.00);
        treeMap.put("Tod Hall", 99.22);
        treeMap.put("Ralph Smith", -19.08);

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        // Display the elements
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into John Doe's account
        double balance = treeMap.get("John Doe");
        treeMap.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + treeMap.get("John Doe"));
    }
}

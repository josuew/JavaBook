package com.softlied.chapter19.CollectionsFramework.example16;

//Use a comparator to sort accounts by last name

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Compare last whole words in two Strings
class TComp implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // Find index of beginning of last name
        i = aStr.indexOf(" ");
        j = bStr.indexOf(" ");

        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) // Last names match, check entire name
            return aStr.compareToIgnoreCase(bStr);
        else return k;
    }
}

public class TreeSetDemo2 {
    public static void main(String[] args) {

        //Create a tree map
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        // Put elements to the map
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        //Get a set of the entries
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Display the elements
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into John Doe's account
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}

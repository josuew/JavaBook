package com.softlied.chapter19.CollectionsFramework.example14;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Compare last whole words in two strings
class TComp implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        int i,j,k;

        //Find index of beginning of last name
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');

        System.out.println(o1);
        System.out.println(o2);

        System.out.println();
        System.out.println();

        k = o1.substring(i).compareToIgnoreCase(o2.substring(j));
        if (k == 0) // last names match, check entire name
            return o1.compareToIgnoreCase(o2);
        else return k;
    }
}
public class TreeMapDemo2 {
    public static void main(String[] args) {
        //Create a treemap
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        //Put elements to the map
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        //Get a set of the entries
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //Display the elements
        for (Map.Entry<String, Double> me : set){
            System.out.println(me.getKey() + " ");
            System.out.println(me.getValue());
        }

        //Deposit 1000 into John Doe's account
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: "+ tm.get("John Doe"));
    }
}

package com.softlied.chapter19.CollectionsFramework.example9;

import java.util.ArrayList;

//Use the for-each for loop to cycle through a collection
public class ForEachDemo {
    public static void main(String[] args) {
        //Create an arraylist for integers
        ArrayList<Integer> vals = new ArrayList<>();

        //Add values to the arraylist
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //Use for loop to display the values
        System.out.println("Contents of vals: ");
        for (Integer v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        //Now sum the values of vals
        int sum = 0;
        for (Integer v : vals) {
            sum += v;
        }
        System.out.println("Sum of values: " + sum);


    }
}

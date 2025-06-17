package com.softlied.chapter19.CollectionsFramework.example18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {

        // Create and initialize linked list
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // Create a reverse order comparator
        Comparator<Integer> reverseOrder = Collections.reverseOrder();

        // Sort the list by using the comparator
        Collections.sort(ll, reverseOrder);

        System.out.println("List sorted in reverse: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Shuffle List
        Collections.shuffle(ll);

        // Display randomized list
        System.out.println("List shuffled: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }
}

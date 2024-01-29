package com.softlied.chapter19.CollectionsFramework.example3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Create a LinkedList
        LinkedList<String> ll = new LinkedList<>();

        //Add elements to the Linked List
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");
        System.out.println("Original Contents of ll: " + ll);

        //Remove elements from the linked list
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of ll after deletion : " + ll);

        //Remove the first and last elements
        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last: " + ll);

        //Get and set a value
        String val = ll.get(0);
        ll.set(2, val);
        System.out.println("ll after change: " + ll);


    }
}

package com.softlied.chapter19.CollectionsFramework.example8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    //Iterator - only Goes Forward, cannot modify collections
    //List Iterator goes backwards and forwards and can modify the list but only works on list
    public static void main(String[] args) {

        //Create an Array List
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        //Use an iterator to display the contents of al
        System.out.println("Original Contents of al: ");
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Modify objects being iterated
        ListIterator<String> lit = al.listIterator();
        while (lit.hasNext()) {
            String element = lit.next();
            lit.set(element + "+");
        }

        System.out.println("Modified Contents of al: ");
        it = al.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Now display the list in backwards
        System.out.println("Modified List in backwards: ");
        while (lit.hasPrevious()) {
            String element = lit.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

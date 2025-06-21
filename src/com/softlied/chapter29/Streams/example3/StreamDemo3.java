package com.softlied.chapter29.Streams.example3;

import java.util.ArrayList;
import java.util.List;

//Demonstrate the use of a combiner with reduce()
public class StreamDemo3 {
    public static void main(String[] args) {
        // This is now a list of Double values
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // One the threads finishes the accumulator, the combiner multiplies de results
        // of each group and it return the result
        double productOfSqrRoots = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
        System.out.println("Product of Sqr Roots: " + productOfSqrRoots);

        List<Integer> myList2 = List.of(1, 2, 3, 4, 5);
        String res = myList2.parallelStream().reduce("", (a, b) -> {
            System.out.println(Thread.currentThread() + " a["+a+"] b["+b+"]");
            return a + b;
        }, (a, b) -> {
            System.out.println("Combine " + Thread.currentThread() + " a["+a+"] b["+b+"]");
            return a + b;
        });
        System.out.println(res);
    }
}

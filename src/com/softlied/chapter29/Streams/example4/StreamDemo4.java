package com.softlied.chapter29.Streams.example4;

import java.util.ArrayList;
import java.util.stream.Stream;

//Map one stream to another
public class StreamDemo4 {
    public static void main(String[] args) {

        // A List of Double values
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // Map the square root of the elements in myList to a new Stream
        Stream<Double> sqrtRootStrm = myList.stream().map(a -> Math.sqrt(a));

        // Find the product of the square roots
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println("Product of sqrtRoots is " + productOfSqrRoots);

    }
}

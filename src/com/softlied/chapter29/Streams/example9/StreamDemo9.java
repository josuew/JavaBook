package com.softlied.chapter29.Streams.example9;

// Use a Spliterator

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {

        //Create a list of Strings
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        // Obtain a Stream to the arrayList
        Stream<String> myStream = myList.stream();

        // Obtain a Spliterator
        Spliterator<String> splitItr = myStream.spliterator();

        // Iterate the elements of the Stream
        while (splitItr.tryAdvance(System.out::println));

    }
}

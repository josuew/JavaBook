package com.softlied.chapter29.Streams.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Create a list of Integer values
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Original List: " + myList);

        //Obtain a Stream to the arraylist
        Stream<Integer> myStream = myList.stream();

        //Obtain the minimum and maximum value by use of min()
        //max(), isPresent(), and get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("Minimum Value: " + minVal.get());

        //Must obtain a new stream because previous call to min()
        // is a terminal operation that consumed the stream 
        myStream = myList.stream();
        Optional<Integer> max = myStream.max(Integer::compare);
        if (max.isPresent()) System.out.println("Max Value: " + max.get());

        //Sort the Stream by use of sorted()
        Stream<Integer> sorted = myList.stream().sorted();

        //Display the sorted stream by use of forEach()
        System.out.print("Sorted List: ");
        sorted.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //Display only the odd values by use of filter()
        Stream<Integer> oddVals = myList.stream().filter(n -> n % 2 == 1);
        System.out.print("Odd values: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //Display only the odd values greater than 5. Notice
        // that two filter operations are pipelined
        oddVals = myList.stream().filter(n -> n % 2 == 1)
                .filter(n -> n > 5);
        System.out.print("Odd values greater than 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();


    }
}

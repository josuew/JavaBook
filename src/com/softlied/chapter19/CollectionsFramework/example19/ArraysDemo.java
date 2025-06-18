package com.softlied.chapter19.CollectionsFramework.example19;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ArraysDemo {
    public static void main(String[] args) {

        // Unmodifiable list
        String[] a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"};
        System.out.println(a);

        // Create a list from an array
        List<String> list = Arrays.asList(a);
        System.out.println("Array List: " + list);

        // Search an element on an array (need to be ordered to work)
        int search = Arrays.binarySearch(a, "A");
        System.out.println("Binary Search: " + search);

        // Array is truncated if newLength is lower than source array
        String[] arrayCopy = Arrays.copyOf(a, 1);
        System.out.println("Array copy: " +  Arrays.toString(arrayCopy));

        // Defines a range of values (end = endSize - 1)
        String[] arrayCopyOfRange = Arrays.copyOfRange(a, 0, 2);
        System.out.println("Array copyOfRange: " + Arrays.toString(arrayCopyOfRange));

        // True if the two arrays are equivalent (have the same values) Otherwise false
        boolean arrayEquals = Arrays.equals(a, arrayCopyOfRange);
        System.out.println("Array equals: " + arrayEquals);

        // Verifies if Arrays have Nested Arrays equal
        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{1, 2}, {3, 5}};
        boolean arrayDeepEquals = Arrays.deepEquals(array1, array2);
        System.out.println("Array deep equals: " + arrayDeepEquals);

        // Fill assigns a value to all elements in an array
//        Arrays.fill(a, "Test");
//        System.out.println("Array filled with Test: " + Arrays.toString(a));

        // Ascending sort is applied to array
        String[] array3 = {"C","A","B"};
        Arrays.sort(array3);
        System.out.println("Array Sort: " + Arrays.toString(array3));

        // Parallel Sorting Array
        String[] array4 = {"A","C","D","B","E","G"};
        Arrays.parallelSort(array4);
        System.out.println("Array Parallel Sort: " + Arrays.toString(array4));

        // Array to Spliterator
        Spliterator<String> arraySpliterator = Arrays.spliterator(a);
        System.out.print("Array Spliterator: ");
        while(arraySpliterator.tryAdvance(System.out::print));
        System.out.println();

        // Array to Stream
        Stream<String> arrayStream = Arrays.stream(a);
        System.out.print("Array Stream: ");
        arrayStream.forEach(System.out::print);
        System.out.println();

        // Set All
        Double[] doubleArray = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        Arrays.setAll(doubleArray, i -> {
            System.out.println("i: " + i);
            return doubleArray[i] + 1;
        });
        System.out.println("Array SetAll: " + Arrays.toString(doubleArray));
    }
}

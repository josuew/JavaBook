package com.softlied.chapter19.CollectionsFramework.example7;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //Create an Array Deque
        ArrayDeque<String> adq = new ArrayDeque<>();

        //Use an Array Deque as a Stack
        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("Popping the stack: ");

        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
}

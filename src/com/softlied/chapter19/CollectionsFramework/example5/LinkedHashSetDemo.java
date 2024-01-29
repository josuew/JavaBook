package com.softlied.chapter19.CollectionsFramework.example5;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Beta");
        lhs.add("Alpha");
        lhs.add("Eta");
        System.out.println(lhs);
        System.out.println(lhs.reversed());
    }
}

package com.softlied.chapter12.Enumerations.example2;

//Use the built-in enumerations demo

// An enumeration if apple varieties
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Here are all the Apple constants: ");

        //use values
        Apple allapples[] = Apple.values();
        for (Apple apple : allapples)
            System.out.println(apple);

        //use valueOf
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);

    }
}

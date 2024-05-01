package com.softlied.chapter17.StringHandling.example6;

//Using concatenation to prevent long lines
public class Concat {
    public static void main(String[] args) {
        String longStr = "This could have been " +
                "a very long line that would have " +
                "wrapped around. But string concatenation " +
                "prevent this.";
        System.out.println(longStr);
    }
}

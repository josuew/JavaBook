package com.softlied.chapter17.StringHandling.example1;

public class MakeString {
    public static void main(String[] args) {
        //Create a new String
        String s = new String();

        //String with initial values
        char chars[] = {'a','b','c'};
        String c = new String(chars);

        char chars2[] = {'a','b','c','d','e','f'};
        String c2 = new String(chars2, 2, 3);
        System.out.println(c2);

        //Construct one String from another
        char chars3[] = {'J','a','v','a'};
        String s2 = new String(chars3);
        String s3 = new String(s2);

        System.out.println(s2);
        System.out.println(s3);
    }
}

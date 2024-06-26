package com.softlied.chapter17.StringHandling.example25;

//Using reverse() to reverse a String Buffer
public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcdef");

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}

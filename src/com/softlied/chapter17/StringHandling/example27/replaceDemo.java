package com.softlied.chapter17.StringHandling.example27;

//Demonstrate replace()
public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test");

        System.out.println(sb);
        sb.replace(5,7,"was");
        System.out.println("After replace: " + sb);
    }
}

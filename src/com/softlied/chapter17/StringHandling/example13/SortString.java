package com.softlied.chapter17.StringHandling.example13;

//A bubble Sort for Strings
public class SortString {

    static String arr[] = {"Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"};

    public static void main(String[] args) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++){
                if (arr[i].compareTo(arr[j]) < 0){
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}

package com.softlied.chapter29.Streams.example7;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {
        //A list of names, phone names, and email addresses
        ArrayList<NamePhoneEmail> myList = new ArrayList<NamePhoneEmail>();

        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@herbSchildt.com"));

        // Map just the names and phone numbers to a new Stream
        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        // Use collect to create a List of the names and phone numbers
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Name and Phone numbers in npList:");

        for (NamePhone e : npList) {
            System.out.println(e.name + ":" + e.phonenum);
        }

        //Obtain another mapping of the names and phones mapping
        nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        // Now create a Set by the use of collect()
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nName and Phone numbers in npSet:");
        for (NamePhone e : npSet) {
            System.out.println(e.name + ":" + e.phonenum);
        }


    }
}

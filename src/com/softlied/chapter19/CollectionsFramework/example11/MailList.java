package com.softlied.chapter19.CollectionsFramework.example11;

import java.util.LinkedList;

class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        //Add elements to the linked list
        ml.add(new Address("J.W. West", "ll Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton","867 Elm St", "Champaing","IL","61820"));

        //Display the mail list
        for (Address element : ml) {
            System.out.println(element);
        }
    }
}

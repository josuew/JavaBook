package com.softlied.chapter13.IOandTryWithResources.example13;

// A poor way to use assert
public class AssertDemo {

    //get a random number generator
    static int val = 3;

    //Return an integer
    static int getnum(){
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;

        for (int i = 0; i < 10; i++){
            assert (n = n = getnum()) > 0;
            System.out.println("n is " + n);
        }
    }
}

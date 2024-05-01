package com.softlied.chapter17.StringHandling.example8;

//Override toString() for Box class
class Box{
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String toString() {
        return "Dimensions are " + width + " by " + height + " by " + depth;
    }
}
public class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10,12,14);
        String s = "Box b: " + b.toString(); // concatenate Box object

        System.out.println(b); // convert Box to String
        System.out.println(s);
    }
}

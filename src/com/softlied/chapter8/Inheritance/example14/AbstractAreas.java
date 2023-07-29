package com.softlied.chapter8.Inheritance.example14;

//using abstract methods and classes
abstract class Figure{
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    //area is now an abstract method
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    //override area for right rectangle
    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    //override area for right triangle
    double area(){
        System.out.println("Inside Area for Triangle");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        //Figuref = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}

package com.softlied.chapter15.Lambda.example8;

//Throw an exception from a lambda expression
interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Array Empty");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double value[] = {1.0,2.0,3.0,4.0,5.0};

        //this block lambda computes the average of an array of doubles
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if (n.length == 0)
                throw new EmptyArrayException();
            for (int i = 0; i <= n.length-1; i++)
                sum += n[i];
            return sum/n.length;
        };

        System.out.println("The average is " + average.func(value));

        //This causes an exception to be thrown
        System.out.println("The average is " + average.func(new double[0]));
    }
}

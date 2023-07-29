package com.softlied.chapter14.Generics.example4;

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number
class Stats<T extends Number> {
    T[] nums; //array of Number of subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }
}

//Demonstrate Stats
public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        //This won't compile because String is not a
        // subclass of Number
//        String strs[] = {"1","2","3","4","5"};
//        Stats<String> strOb = new Stats<String>(strs);

//        double x = strOb.average();
//        System.out.println("strob average is " + x);
    }
}

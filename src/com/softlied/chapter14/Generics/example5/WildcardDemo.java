package com.softlied.chapter14.Generics.example5;

//Use a wildcard
class Stats<T extends Number>{
    T[] nums; // Array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass
    Stats(T[] o){
        nums = o;
    }

    //Return the type double in all cases
    double average(){
        double sum = 0.0;

        for (int i = 0 ; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }

    //Determine if two averages are the same
    // Notice the use of wildcard
    boolean sameAvg(Stats<?> ob){
        if (average() == ob.average())
            return true;
        return false;
    }
}

//Demonstrate Wildcard
public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float fnums[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("fob average is " + x);

        //See which arrays have same average
        if (iob.sameAvg(dob))
            System.out.println("are the same");
        else System.out.println("differ");

        if (iob.sameAvg(fob))
            System.out.println("are the same");
        else System.out.println("differ");
    }
}

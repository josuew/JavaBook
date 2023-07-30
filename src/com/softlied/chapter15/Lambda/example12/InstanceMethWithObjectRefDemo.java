package com.softlied.chapter15.Lambda.example12;

//Use an instance method reference with different objects

//A functional interface that takes two reference arguments
//and returns a boolean result
interface MyFunc<T>{
    boolean func(T v1, T v2);
}

//A class that stores the temperature high for a day
class HighTemp{
    private int htemp;

    HighTemp(int ht){
        htemp = ht;
    }

    //Return true if the invoking HighTemp object has the same temperature as ht2
    boolean lessThanTemp(HighTemp h2){
        return  htemp < h2.htemp;
    }
}
public class InstanceMethWithObjectRefDemo {
    //A method that returns the number of occurrences
    // of an object for which some criteria, as specified by
    // the MyFunc parameter, is true
    static <T> int counter(T[] vals, MyFunc<T> f, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v)) count++;
        return count;
    }

    public static void main(String[] args) {
        int count;

        //Create an array of HighTemp objects
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        HighTemp[] weekDayHighs2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };

        // Use counter() with arrays of the class HighTemp
        // Notice that a reference to the instance method
        // sameTemp() is passed as the second argument
        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        // Now, use lessThanTemp() to find days when temperature was less
        // than specified value
        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(count + " days had a high of 19");
    }
}

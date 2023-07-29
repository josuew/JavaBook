package com.softlied.chapter14.Generics.example8;

// A generic interface example

// A Min/Max interface
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

// Now, implement MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;

    MyClass(T[] o){
        vals = o;
    }

    //Return the minimum value in vals
    public T min(){
        T v = vals[0];
        for (int i = 0; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0) v = vals[i];
        return v;
    }

    public T max(){
        T v = vals[0];
        for (int i = 0; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0) v = vals[i];
        return v;
    }
}

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Character chs[] = {'b','r','p','w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Max value in inums is " + iob.max());
        System.out.println("Min value in inums is " + iob.min());

        System.out.println("Max value in chs is " + cob.max());
        System.out.println("Min value in chs is " + cob.min());
    }
}

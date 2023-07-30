package com.softlied.chapter15.Lambda.example13;


//Demonstrate a method reference to a generic method
//declared inside a non-generic class

//A functional interface that operates ib ab array
// and a value, and returns an int result
interface MyFunc<T>{
    int func(T[] vals, T v);
}

//This class defines a method called countMatching() that
// returns the number of items in an array that are equal
// to a specified value. Notice that countMatching()
// is generic but MyArrayOps is not
class MyArrayOps{
    static <T> int countMatching(T[] vals, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v) count++;
        return count;
    }
}
public class GenericMethodRefDemo {
    //This method has the MyFunc Functional interface as the
    // type of its first parameter. The other two parameters
    // receive an array and a value, both of type T
    static <T> int myOp(MyFunc<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,2,3,4,3,5};
        String[] strs = {"One","Two","Three","Four"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOp(MyArrayOps::countMatching, strs, "Two");
        System.out.println("strs contains " + count + " Twos");
    }
}

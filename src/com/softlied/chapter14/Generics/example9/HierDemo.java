package com.softlied.chapter14.Generics.example9;

//A simple generic class hierarchy
class Gen<T>{
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    //Return ob
    T getOb() {
        return ob;
    }
}

class Gen2<T, V> extends Gen<T>{
    V ob2;

    Gen2(T ob, V ob2){
        super(ob);
        this.ob2 = ob2;
    }

    V getOb2(){
        return ob2;
    }

}


public class HierDemo {
    public static void main(String[] args) {
        //Create a Gen2 object for String and Integer
        Gen2<String, Integer> x = new Gen2<>("Value is: ", 99);

        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}

package com.softlied.chapter8.Inheritance.example17;

// When working with inheritance, the inferred type is the declared
//type of the initializer, which may not be the most derived type of
//the object being referred to by the initializer
class MyClass{

}

class FirstDerivedClass extends MyClass{
    int x;
}

class SecondDerivedClass extends FirstDerivedClass{
    int y;
}

public class TypeInferenceAndInheritance {
    //Return some type of MyClass object
    static MyClass getObj(int which){
        switch (which){
            case 0: return new MyClass();
            case 1: return new FirstDerivedClass();
            default: return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        // Even through getObj() return different types of
        //objects within the MyClass inheritance hierarchy,
        //its declared return type is MyClass. As a result,
        //in all three cases shown here, the type of the
        //variables is inferred to be MyClass, even through
        //different derived types of objects are obtained

        //Here, getOb() returns MyClass object
        var mc = getObj(0);

        //In this case, a FirstDerivedClass object is returned
        var mc2 = getObj(1);

        //Here, a SecondDerivedClass object is returned
        var mc3 = getObj(2);

        //Because the type os both mc2, mc3 are inferred
        //as MyClass (because the return type of getOb() is
        //MyClass), neither mc2 nor mc3 can access to the fields declared
        // by FirstDerivedClass or SecondDerivedClass
        //mc2.x = 10;
        //mc3.y = 10;
    }
}

package com.softlied.chapter14.Generics.example6;

// Two dimensional coordinates
class TwoD{
    int x,y;

    TwoD(int a, int b){
        x = a;
        y = b;
    }
}

//Three dimensional coordinates
class ThreeD extends TwoD{
    int z;

    public ThreeD(int a, int b, int z) {
        super(a, b);
        this.z = z;
    }
}

//Four-dimensional coordinates
class FourD extends ThreeD{
    int t;

    public FourD(int a, int b, int z, int t) {
        super(a, b, z);
        this.t = t;
    }
}

//This class holds an array of coordinate objects
class Coords<T extends TwoD>{
    T[] coords;

    Coords(T[] o){
        coords = o;
    }

}

//Demonstrate Bounded Wildcard
public class BoundedWildcard {

    static void showXY(Coords<?> c){
        System.out.println("X Y Coordinates: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X Y Z Coordinates: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
    }

    static void showAll(Coords<? extends FourD> c){
        System.out.println("X Y Z T Coordinates: ");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4),
                new TwoD(-1,-2)
        };

        Coords<TwoD> tdlocs = new Coords<>(td);

        System.out.println("Contents of tdlocs");
        showXY(tdlocs);
//        showXYZ(tdlocs);
//        showAll(tdlocs);

        //Now create some FourD objects
        FourD fd[] = {
                new FourD(1,2,3,4),
                new FourD(6,8,14,8),
                new FourD(22,9,4,9),
                new FourD(3,-2,-23,17)
        };

        Coords<FourD> fdlocs = new Coords<>(fd);

        System.out.println("Contents of fdlocs");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }
}

package com.softlied.chapter9.PackagesAndInterfaces.example2.p2;

import com.softlied.chapter9.PackagesAndInterfaces.example2.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        //class or package only
//        System.out.println("n = " + p.n);

        //class only
//        System.out.println("n_pri = " + p.n_pri);

        //class, subclass or package only
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}

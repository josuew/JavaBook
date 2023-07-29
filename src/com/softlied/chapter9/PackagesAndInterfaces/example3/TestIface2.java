package com.softlied.chapter9.PackagesAndInterfaces.example3;

interface Callback{
    void callback(int param);
}

class Client implements Callback{
    public void callback(int p){
        System.out.println("Callback called with " + p);
    }
}

class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient oc = new AnotherClient();
        c.callback(42);

        c = oc;
        c.callback(42);
    }
}

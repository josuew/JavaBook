package com.softlied.chapter11.MultiThreading.example6;

//This program is not synchronized
class CallMe{
    void call(String msg){
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String s){
        this.target = targ;
        this.msg = s;
        t = new Thread(this);
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

public class Synch {
    public static void main(String[] args) {
        CallMe callMe = new CallMe();
        Caller ob1 = new Caller(callMe, "Hello");
        Caller ob2 = new Caller(callMe, "Synchronized");
        Caller ob3 = new Caller(callMe, "World");

        //Start the threads
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        //wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException ex){
            System.out.println("Interrupted");
        }
    }
}

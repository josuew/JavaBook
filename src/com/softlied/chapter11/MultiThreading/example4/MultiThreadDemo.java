package com.softlied.chapter11.MultiThreading.example4;

//Create multiple threads
class NewThread implements Runnable{

    String name;
    Thread t;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }

    //This is the entry point for thread
    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ex){
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " exiting");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        //Start the threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            //wait for other threads to end
            Thread.sleep(10000);
        }catch (InterruptedException ex){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread exiting.");
    }
}

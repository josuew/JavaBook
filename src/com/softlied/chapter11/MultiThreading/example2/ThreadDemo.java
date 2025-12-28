package com.softlied.chapter11.MultiThreading.example2;

// create a second thread
class NewThread implements Runnable{
    Thread t;

    public NewThread() {
        this.t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
    }


    //This is the entry point for the second thread
    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException ex){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child Thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); //create a new Thread
        nt.t.start();
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ex){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting...");
    }
}

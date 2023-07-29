package com.softlied.chapter9.PackagesAndInterfaces.example5;

interface IntStack{
    void push(int item);
    int pop();
}

class FixedStack implements IntStack{
    private int stck[];
    private int tos;

    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    //Push an item from the stack
    public void push(int item){
        if(tos == stck.length-1)
            System.out.println("Stack is full");
        else stck[++tos] = item;
    }

    //Pop an item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else return stck[tos--];
    }
}

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        //push some number onto the stack
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        //pop those numbers off the stack
        System.out.println("Stack un mystack1: ");
        for (int i = 0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack ub nystack2: ");
        for(int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}

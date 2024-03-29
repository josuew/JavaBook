package com.softlied.chapter9.PackagesAndInterfaces.example8;

interface MyIF{
    //this is a "normal" interface method declaration
    //It does NOT define a default implementation
    int getNumber();

    //This is a default method Notice that it provides
    // a default implementation
    default String getString(){
        return "Default String";
    }
}

class MyIFImpl implements MyIF{
    //Only getNumber() defined MyIF needs to be implemented
    //getString() can be allowed to default
    public int getNumber(){
        return 100;
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImpl obj = new MyIFImpl();
        //Can call getNumber(), because it is explicitly
        //implemented by MyIFimpl
        System.out.println(obj.getNumber());

        //Can also call getString(), because of default
        //implementation
        System.out.println(obj.getString());
    }
}

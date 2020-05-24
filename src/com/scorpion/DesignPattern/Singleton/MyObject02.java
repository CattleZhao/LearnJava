package com.scorpion.DesignPattern.Singleton;

public class MyObject02 {
    private static MyObject02 myObject;

    private MyObject02() {
    }

    public static MyObject02 getObject(){
        if (myObject == null){
            myObject = new MyObject02();
        }
        return myObject;
    }

}

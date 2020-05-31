package com.scorpion.designpattern.singleton;

public class MyObject03 {

    private static volatile MyObject03 myObject;

    private MyObject03(){}

    public static MyObject03 getInstance(){
        if (myObject == null){
            synchronized (MyObject03.class){
                if (myObject == null){
                    myObject = new MyObject03();
                }
            }
        }
        return myObject;
    }


}

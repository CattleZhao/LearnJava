package com.scorpion.designpattern.singleton;

public class MyObject01 {
    private static MyObject01 myObject = new MyObject01();

    private MyObject01() {
    }

    public static MyObject01 getInstance() {
        return myObject;
    }

    public static void main(String[] args) {

    }
}

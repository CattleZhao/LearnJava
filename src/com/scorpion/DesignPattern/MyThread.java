package com.scorpion.DesignPattern;

import com.scorpion.DesignPattern.Singleton.MyObject01;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject01.getInstance().hashCode());
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}

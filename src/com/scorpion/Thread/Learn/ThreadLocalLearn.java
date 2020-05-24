package com.scorpion.Thread.Learn;

public class ThreadLocalLearn {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        new Thread(() -> {
            threadLocal.set("test1");
            System.out.println("thread1: " + threadLocal.get());
        }).start();
        new Thread(() -> {
            threadLocal.set("test2");
            System.out.println("thread2: " + threadLocal.get());
        }).start();
    }

}

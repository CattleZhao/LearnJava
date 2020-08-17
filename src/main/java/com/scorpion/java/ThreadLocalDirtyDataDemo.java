package com.scorpion.java;

public class ThreadLocalDirtyDataDemo {
    private static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello");
        Thread thread = new Thread(()->{
            System.out.println("子线程：" + threadLocal.get());
        });
        thread.run();
        System.out.println("Main线程：" + threadLocal.get());
    }

}
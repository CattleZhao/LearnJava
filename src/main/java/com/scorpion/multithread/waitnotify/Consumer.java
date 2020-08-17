package com.scorpion.multithread.waitnotify;

public class Consumer extends Thread {
    private Producer producer;

    public Consumer(String name, Producer p) {
        super(name);
        producer = p;
    }

    @Override
    public void run() {
        while (true) {
            String s = producer.waitMsg();
            System.out.println("Thread " + getName() + "Msg: " + s);
        }
    }

    public static void main(String[] args) {
        Producer p = new Producer();
        p.start();
        new Consumer("1", p).start();
        new Consumer("2", p).start();
        new Consumer("3", p).start();
    }
}

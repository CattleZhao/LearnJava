package com.scorpion.multithread.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread{
    List<String> msgList = new ArrayList<>();
    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep(3000);
                synchronized (msgList){
                    msgList.add("adsddada");
                    msgList.notifyAll();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String waitMsg(){
        synchronized (msgList){
            if (msgList.size() == 0){
                try {
                    msgList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return msgList.remove(0);
        }
    }
}

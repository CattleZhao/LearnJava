package com.scorpion.jvm;

public class SyncCodeBlock {
    public int i;

    public synchronized void syncTask() {
        i++;
    }

}

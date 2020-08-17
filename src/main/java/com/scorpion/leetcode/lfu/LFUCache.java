package com.scorpion.leetcode.lfu;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LFUCache {
    HashMap<Integer, Integer> keyToVal;
    HashMap<Integer, Integer> keyToFreq;
    HashMap<Integer, LinkedHashSet<Integer>> freqToKeys;
    int cap;
    int minFreq;

    public LFUCache(int capacity) {
        keyToVal = new HashMap<>();
        keyToFreq = new HashMap<>();
        freqToKeys = new HashMap<>();
        this.cap = capacity;
        this.minFreq = 0;
    }

    public int get(int key) {
        //首先检查key存不存在
        if (!keyToVal.containsKey(key)) {
            return -1;
        }
        //增加key的freq
        increaseFreq(key);
        return keyToVal.get(key);
    }

    private void increaseFreq(int key){
        int freq = keyToFreq.get(key);
        keyToFreq.put(key, freq + 1);
        freqToKeys.get(freq).remove(key);
        freqToKeys.putIfAbsent(freq + 1, new LinkedHashSet<>());
        freqToKeys.get(freq + 1).add(key);
        if (freqToKeys.get(freq).isEmpty()){
            freqToKeys.remove(freq);
            if (freq == minFreq){
                minFreq++;
            }
        }
    }

    private void removeMinFreqKey(){
        LinkedHashSet<Integer> keyList = freqToKeys.get(minFreq);
        int deletedKey = keyList.iterator().next();
        keyList.remove(deletedKey);
        if (keyList.isEmpty()){
            freqToKeys.remove(this.minFreq);
        }
        keyToVal.remove(deletedKey);
        keyToFreq.remove(deletedKey);
    }

    public void put(int key, int val) {
        //若key存在
        if (keyToVal.containsKey(key)){
            keyToVal.put(key, val);
            //增加key的freq
            increaseFreq(key);
            return;
        }
        if (this.cap <= keyToVal.size()){
            removeMinFreqKey();
        }
        //若不存在
        keyToVal.put(key, val);
        keyToFreq.put(key, 1);
        freqToKeys.putIfAbsent(1, new LinkedHashSet<>());
        freqToKeys.get(1).add(key);
        this.minFreq = 1;
    }

}

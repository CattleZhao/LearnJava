package com.scorpion.leetcode.lru;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, Node> map;
    LinkedHashMap<Integer, Integer> cache1 = new LinkedHashMap<>();
    private DoubleList cache;
    private int cap;
    public LRUCache(int cap){
        map = new HashMap<>();
        cache = new DoubleList();
        this.cap = cap;
    }

    public int get(int key){
        if (!map.containsKey(key)){
            return -1;
        }
        makeRecently(key);
        return map.get(key).val;
    }

    public void put(int key, int val){
        if (map.containsKey(key)){
            //如果包含
            deleteKey(key);
            addRecently(key, val);
            return;
        }
        if (cache.size() == cap){
            removeLeastRecently();
        }
        addRecently(key, val);

    }


    /**
     * 将某个key提升为最近使用
     * @param key
     */
    private void makeRecently(int key){
        Node x = map.get(key);
        // 从cache中删除
        cache.remove(x);
        cache.addLast(x);
    }

    /**
     * 添加最近使用
     * @param key
     * @param val
     */
    private void addRecently(int key, int val){
        Node node = new Node(key, val);
        cache.addLast(node);
        map.put(key, node);
    }

    /**
     * 删除某一个key
     * @param key
     */
    private void deleteKey(int key){
        Node node = map.get(key);
        map.remove(key);
        cache.remove(node);
    }

    private void removeLeastRecently(){
        Node node = cache.removeFirst();
        map.remove(node.key);
    }

}

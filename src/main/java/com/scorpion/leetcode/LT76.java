package com.scorpion.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LT76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> needs = new HashMap();
        Map<Character, Integer> windows = new HashMap();
        for(char c : t.toCharArray()){
            needs.put(c, 1);
        }
        System.out.println(windows.get('a'));
        return null;
    }

    public static void main(String[] args) {
        Map<Character, Integer> needs = new HashMap();
        Map<Character, Integer> windows = new HashMap();
        windows.putIfAbsent('a', 0);
        windows.put('a', windows.putIfAbsent('a', 0)+1);
        windows.put('a', windows.putIfAbsent('a', 0)+1);
        System.out.println(windows.get('a'));
    }
}

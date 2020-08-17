package com.scorpion.leetcode.array;

public class Array1160 {

    public int countCharacters(String[] words, String chars) {
        int res = 0;
        int[] chars_count = count(chars);
        for (int i = 0; i < words.length; i++) {
            int[] word_count = count(words[i]);
            if (check(word_count, chars_count)){
                res += words[i].length();
            }
        }
        return res;
    }

    private static boolean check(int[] word_count, int[] chars_count){
        for (int i = 0; i < 26; i++) {
            if (word_count[i] > chars_count[i]){
                return false;
            }
        }
        return true;
    }


    private static int[] count (String chars){
        int[] res = new int[26];
        for (int i = 0;i < chars.length(); i++){
            res[chars.charAt(i) - 'a'] ++;
        }
        return res;
    }

}

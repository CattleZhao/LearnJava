package com.scorpion.leetcode.NowCoder;

import java.util.ArrayList;

public class PalindromePartitioning {


    ArrayList<ArrayList<String>> res;
    public ArrayList<ArrayList<String>> partition(String s){
        res = new ArrayList<ArrayList<String>>();
        ArrayList<String> tmp = new ArrayList<>();
        helper(s,0,tmp);
        return res;
    }

    public void helper(String s, int start, ArrayList<String> tmp){
        if (start>=s.length()){
            ArrayList<String> list = new ArrayList<>(tmp);
            res.add(list);
            return;
        }
        //搜索可能的字串，如果是回文就继续搜索
        for (int i = start ; i < s.length(); i++) {
            String sub =s.substring(start,i+1);
            if (isPalindrome(sub)){
                tmp.add(sub);
                helper(s,i+1,tmp);
                tmp.remove(tmp.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s){
        int i=0,j = s.length()-1;
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

}

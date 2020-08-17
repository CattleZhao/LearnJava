package com.scorpion;

public class IBM {
    public static int[][] dp;
    public static int process(int m,int n){
        if(m == 0 && n == 0) return 0;
        if(m == 1 && n == 0) return 1;
        if(m == 0 && n == 2) return 1;
        if(m == 0){
            return process(m,n-2);
        }
        if(n == 0){
            return process(m-1,n);
        }
        return process(m,n-2)+process(m-1,n);
    }

    public static void main(String[] args) {
        System.out.println(process(5,2));
    }
}

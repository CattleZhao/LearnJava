package com.scorpion.LeetCode.Array;

public class Array1010 {

    //chaoshi
    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0){
                    count ++;
                }
            }
        }
        return count;
    }

    public static int numPairsDivisibleBy602(int[] time) {
        int[] seconds = new int[60];
        for (int i = 0; i < time.length; i++) {
            seconds[time[i]%60] ++;
        }
        int count = 0;
        count += combination(seconds[0], 2);
        count += combination(seconds[30], 2);
        int i = 1, j = 59;
        while (i < j) {
            count += seconds[i++] * seconds[j--];
        }
        return count;
    }
    public static int combination(int n, int k){
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1)/i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {15,63,451,213,37,209,343,319};
        System.out.println(numPairsDivisibleBy60(num));
    }

}

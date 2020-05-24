package com.scorpion.DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class StringMatch {
    public static void BF(String s1, String s2) {
        int index = 0;
        int l1 = s1.length();
        int l2 = s2.length();
        int i = 0, j = 0;
        while (i < l1 && j < l2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j >= l2) {
            index = i - j;
            System.out.println("Successful, index: " + index);
        } else {
            System.out.println("Failed.");
        }
    }

    public static int[] getNext(String t) {
        int[] next = new int[t.length()];
        next[0] = -1;
        next[1] = 0;
        int j = 2;
        while (j < t.length()) {
            if (t.charAt(next[j - 1]) == t.charAt(j - 1)) {
                next[j] = next[j - 1] + 1;
                j++;
            } else if (t.charAt(0) == t.charAt(j - 1)) {//判断是否与字串第一个字符相等
                next[j] = 1;
                j++;
            } else {
                next[j] = 0;
                j++;
            }
        }
        return next;
    }

    public static int[] getNext2(String t) {
        int[] next = new int[t.length()];
        int i = 0, j = -1;
        next[0] = -1;
        while (i < t.length() - 1) {
            if (j == -1 || t.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else
                j = next[j];
        }
        return next;
    }

    /**
     * KMP优化版
     *
     * @param t
     * @return
     */
    public static int[] getNextVal(String t) {
        int[] next = new int[t.length()];
        int i = 0, j = -1;
        while (i < t.length() - 1) {
            if (j == -1 || t.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                if (t.charAt(i) == t.charAt(j))
                    next[i] = next[j];
                else
                    next[i] = j;
            } else
                j = next[j];
        }
        return next;
    }

    public static void KMP(String s1, String s2) {
        int index = 0;
        int[] next = getNext2(s2);
        System.out.println(Arrays.toString(next));
        int l1 = s1.length();
        int l2 = s2.length();
        int i = 0, j = 0;
        while (i < l1 && j < l2) {
            if (j == -1 || s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j >= l2) {
            index = i - j;
            System.out.println("Successful, index: " + index);
        } else {
            System.out.println("Failed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input main string:");
        String mainString = scanner.nextLine();// 从标准输入读取主串
        System.out.println("Please input sub string:");
        String subString = scanner.nextLine();// 从标准输入读取子串
        KMP(mainString, subString);
    }
}

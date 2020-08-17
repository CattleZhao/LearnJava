package com.scorpion.PDD;

import java.util.Arrays;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l1 = scanner.nextInt();
        int[] h = new int[l1];
        for (int i = 0; i < l1; i++) {
            h[i] = scanner.nextInt();
        }
        int l2 = scanner.nextInt();
        int[] w = new int[l2];
        for (int i = 0; i < l2; i++) {
            w[i] = scanner.nextInt();
        }
        Arrays.sort(h);
        Arrays.sort(w);
        int i = 0, j = 0;
        int count = 0;
        while (i < l2 && j < l1) {
            if (w[i]<h[j]){
                i++;
            }else {
                count++;
                i++;
                j++;
            }
        }
        System.out.println(count);
    }

}

package com.scorpion.PDD;

import java.util.Scanner;

public class A {

    public static long getMax(int[] A){
        long max1 = Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE;
        long min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i]>max1) {
                max3 = max2;
                max2 = max1;
                max1 = A[i];
            }else if(A[i]>max2){
                max3 = max2;
                max2 = A[i];
            }else if (A[i]>max3){
                max3 = A[i];
            }
            if (A[i]<min1){
                min2 = min1;
                min1 = A[i];
            }else if (A[i]<min2){
                min2 = A[i];
            }

        }
        return Math.max(max1*max2*max3, max1*min1*min2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length= scanner.nextInt();
        int[] A = new int[length];
        for (int i = 0; i < length; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(getMax(A));

    }

}

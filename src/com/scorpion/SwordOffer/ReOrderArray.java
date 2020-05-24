package com.scorpion.SwordOffer;

import java.util.Arrays;

public class ReOrderArray {

    public static void reOrderArray(int[] array) {
        if (array == null || array.length <= 0)
            return;
        int count = 0;
        int [] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1)
                count++;
        }
        int k =0;
        int j = count;
        for (int i = 0;i<array.length;i++){
            if (array[i]%2==1)
                result[k++]=array[i];
            else
                result[j++] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        reOrderArray(a);
    }

}

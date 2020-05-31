package com.scorpion.leetcode.Array;

public class Array1089 {

    public void duplicateZeros(int[] arr) {
        int count = 0;
        int len = arr.length;
        int i = 0;
        while (i + count < len) {
            if (arr[i++] == 0) count++;
        }
        i--;
        int j = len - 1;
        //这里的判断是来看最后的有效的数字是不是0，如果是0的话这个复制会数据越界，如何根据这个来判断是不是0呢：
        // 因为第9行的终结条件是i + count > len, 如果arr[i-1]不是0，那么i+count-len=0
        // 如果arr[i-1]==0, 那么i+count-len=1，因为此时i加了一次，count也加了一次，所以这里判断i+count+1-len=1>0
        // 这个判断里面的+1是为了弥补13行的-1来还原真实的终止循环的情况
        if (i + count + 1 > len) {
            arr[j--] = arr[i--];
            count --;
        }
        while (count > 0){
            arr[j--] = arr[i];
            if (arr[i] == 0){
                arr[j--] = arr[i];
                count --;
            }
            i--;
        }
    }

}

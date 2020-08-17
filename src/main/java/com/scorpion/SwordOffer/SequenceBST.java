package com.scorpion.SwordOffer;

public class SequenceBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length < 0)
            return false;
        return VerifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    private boolean VerifySquenceOfBST(int[] sequence, int start, int end) {
        if (start >= end)
            return true;
        int root = sequence[end];
        int i = 0;
        for (; i < end; i++) {
            if (sequence[i] > root)
                break;
        }
        int j = i;
        for (; j < end; j++) {
            if (sequence[j] < root)
                return false;
        }
        boolean left = true;
        if (i > 0)
            left = VerifySquenceOfBST(sequence, start, i - 1);
        boolean right = true;
        if (i < end)
            right = VerifySquenceOfBST(sequence, i, end - 1);
        return left && right;
    }
}

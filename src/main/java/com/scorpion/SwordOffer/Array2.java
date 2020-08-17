package com.scorpion.SwordOffer;

public class Array2 {
    public boolean Find(int target, int[][] array) {
        boolean found = false;
        if (array != null) {
            int rows = array.length;
            int columns = array[0].length;
            int row = 0;
            int column = columns - 1;
            while (row < rows && column > 0) {
                if (array[row][column]==target){
                    found = true;
                    break;
                }else {
                    if (array[row][column]>target)
                        column--;
                    else
                        row++;
                }
            }
        }
        return found;
    }
}

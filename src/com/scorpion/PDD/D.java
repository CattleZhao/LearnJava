package com.scorpion.PDD;


import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        char[][] matrix = new char[M][N];
        for (int i = 0; i < M; i++) {
                matrix[i] = scanner.nextLine().toCharArray();
        }
        int x0 = 0, y0 = 0;
        int xd = 0, yd = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == '2') {
                    x0 = i;
                    y0 = j;
                    continue;
                }
                if (matrix[i][j] == '3') {
                    xd = i;
                    yd = j;
                    break;
                }
            }
        }

    }
}

package com.scorpion.PDD;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    // 四个方向
    private static int[] xx = new int[]{0, 0, 1, -1};
    private static int[] yy = new int[]{1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine();
            char[][] datas = new char[m][n];
            for (int i = 0; i < m; i++) {
                datas[i] = scanner.nextLine().toCharArray();
            }
            int x0 = 0, y0 = 0;
            int xd = 0, yd = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (datas[i][j] == '2') {
                        x0 = i;
                        y0 = j;
                        continue;
                    }
                    if (datas[i][j] == '3') {
                        xd = i;
                        yd = j;
                        break;
                    }
                }
            }
            System.out.println(bfs(datas, m, n, x0, y0, xd, yd));
        }
    }

    private static int bfs(char[][] datas, int m, int n, int x0, int y0, int xd, int yd) {
        LinkedList queue = new LinkedList<>();
        int[][][] keys = new int[m][n][1024];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int s = 0; s < 1024; s++) {
                    keys[i][j][s] = Integer.MAX_VALUE;
                }
            }
        }
        queue.add(new Node(x0, y0, 0));
        keys[x0][y0][0] = 0;
        Node node = null;
        int x = 0;
        int y = 0;
        int key = 0;
        while (queue.size() > 0) {
            node = (Node) queue.poll();
            x = node.x;
            y = node.y;
            key = node.key;
            if (x == xd && y == yd)
                return keys[x][y][key];
            for (int i = 0; i < 4; i++) {
                x = node.x + xx[i];
                y = node.y + yy[i];
                key = node.key;
                if (!isValid(x, y, m, n, datas))
                    continue;
// 最多10把钥匙
                if (datas[x][y] >= 'a' && datas[x][y] <= 'j') {
                    key = key | (0x1 << (datas[x][y] - 'a'));
                }
// 有对应的钥匙继续往下走，没有则跳过
                if (datas[x][y] >= 'A' && datas[x][y] <= 'J') {// door
                    if ((key & (0x1 << (datas[x][y] - 'A'))) > 0) {// haskey
// key = key | ~(0x1 << (datas[x][y] - 'A'));
                    } else {
                        continue;
                    }
                }
// keys[x][y][key] 钥匙数
                if (keys[x][y][key] > keys[node.x][node.y][node.key] + 1) {
                    keys[x][y][key] = keys[node.x][node.y][node.key] + 1;
                    queue.add(new Node(x, y, key));
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    private static boolean isValid(int x, int y, int m, int n, char[][] data) {
        if (x >= 0 && x < m && y >= 0 && y < n && data[x][y] != '0')
            return true;
        return false;
    }

    private static class Node {
        int x;
        int y;
        int key;

        public Node(int x, int y, int keys) {
            this.x = x;
            this.y = y;
            this.key = keys;
        }
    }
}

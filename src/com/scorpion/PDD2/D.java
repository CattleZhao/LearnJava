package com.scorpion.PDD2;


import java.util.*;

class Point {
    public int value, k, index;

    public Point(int value, int k, int index) {
        this.value = value;
        this.k = k;
        this.index = index;
    }
}

public class D {


    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            int K = Integer.parseInt(scanner.nextLine());
            PriorityQueue<Point> q2 = new PriorityQueue<>(Comparator.comparing(point -> point.value));
            PriorityQueue<Point> q = new PriorityQueue<>(new Comparator<Point>() {
                @Override
                public int compare(Point o1, Point o2) {
                    return o1.value-o2.value;
                }
            });
            for (int i = 0; i < K; i++) {
                String[] s = scanner.nextLine().split(",");
                System.out.println(Arrays.toString(s));
                int N = s.length;
                for (int j = 0;j<N;j++){
                    int x = Integer.parseInt(s[j]);
                    q.add(new Point(x, i, j));
                }
            }
            int[] countArray = new int[K];
            Queue<Point> qq = new LinkedList<>();
            int nonzeroCount = 0;
            int minus = Integer.MAX_VALUE;
            int start = 0, end = 0;
            boolean startCheck = false;
            while (!q.isEmpty()) {
                Point now = q.poll();
                qq.add(now);
                countArray[now.k]++;
                if (countArray[now.k] == 1) {
                    nonzeroCount++;
                    if (nonzeroCount == K) {
                        startCheck = true;
                    }
                } //弹出重复的元素
                while (!qq.isEmpty() && countArray[qq.peek().k] > 1) {
                    countArray[qq.peek().k]--;
                    qq.poll();
                }
                if (startCheck)
                {
                    int minValue = qq.peek().value;
                    int nowMinus = now.value - minValue;
                    if (nowMinus < minus) {
                        minus = nowMinus;
                        start = minValue;
                        end = now.value;
                    }
                }
            }
            System.out.println(start + " " + end);
        }
    }
}

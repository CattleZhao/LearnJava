package com.scorpion.PDD2;

import java.util.HashSet;
import java.util.Set;

public class C {
    public static int x = 2;
    public static int y = 4;
    public static int[][] map;
    public static Set<String> set = new HashSet<String>();

    public static boolean move(int direction) {
        boolean res = true;
        switch (direction) {
            case 0:
                if (y + 1 < map[0].length && map[x][y + 1] == 1) {
                    y++;
                } else {
                    res = false;
                }
                break;
            case 1:
                if (y - 1 >= 0 && map[x][y - 1] == 1) {
                    y--;
                } else {
                    res = false;
                }
                break;
            case 2:
                if (x - 1 >= 0 && map[x - 1][y] == 1) {
                    x--;
                } else {
                    res = false;
                }
                break;
            case 3:
                if (x + 1 < map.length && map[x + 1][y] == 1) {
                    x++;
                } else {
                    res = false;
                }
                break;

            default:
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        map = new int[][] { { 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1 } };
        slove();
        System.out.println(set.size());
    }

    private static void slove() {
        // TODO Auto-generated method stub
        String dir = x + "," + y;

        if (!set.contains(dir)) {
            set.add(dir);
            if(move(0)){
                slove();
                y--;
            }
            if(move(1)){
                slove();
                y++;
            }
            if(move(2)){
                slove();
                x++;
            }
            if(move(3)){
                slove();
                x--;
            }
        }

    }
}

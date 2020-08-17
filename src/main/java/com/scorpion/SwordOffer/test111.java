package com.scorpion.SwordOffer;

import java.util.LinkedList;
import java.util.Scanner;

public class test111 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                list.add(new Integer(i));
            else
                System.out.println(i);
        }
        try {
            if (n % 2 == 0) {
                while (list.getFirst() != null) {
                    System.out.println(list.pollFirst());
                    list.offerLast(list.pollFirst());
                }
            } else {
                while (list.getFirst() != null) {
                    list.add(list.pollFirst());
                    System.out.println(list.pollFirst());

                }
            }
        }catch (Exception e){

        }

    }

}

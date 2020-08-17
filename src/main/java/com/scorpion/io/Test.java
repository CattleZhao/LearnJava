package com.scorpion.io;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("")));
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream("/Users/scorpion/test.txt"));
        byte[] bs = new byte[5];
//        reader.read(bs);
//        System.out.println(new String(bs));
        int c;
        while (reader.read(bs)!=-1){
            System.out.println(1);
            System.out.println(new String(bs));
        }
        reader.close();

    }

    private static void test01() {
        byte[] bytes = {12, 21, 34, 11, 21};
    }
}

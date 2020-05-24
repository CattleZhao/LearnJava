package com.scorpion.PDD2;

import java.util.Scanner;
import java.util.Stack;

public class B {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(isTrue(str));
    }
    public static boolean isTrue(String str) {
        Stack<Character> chs = new Stack<Character>();
        int flag = 0;
        for(int i = 0;i<str.length();i++) {
            Character c = str.charAt(i);
            switch (c) {
                case '{':
                    flag=3;
                    if(chs.size()==0) {
                        chs.add(c);
                        break;
                    }
                    if(chs.peek()=='['||chs.peek()=='(') {
                        return false;
                    }
                    chs.add(c);
                    break;
                case '[':
                    flag = 2;
                    if(chs.size()==0) {
                        chs.add(c);
                        break;
                    }
                    if(chs.peek()=='['||chs.peek()=='(') {
                        return false;
                    }
                    chs.add(c);
                    break;
                case '(':
                    flag = 1;
                    if(chs.size()==0) {
                        chs.add(c);
                        break;
                    }
                    if(chs.peek()=='(' || chs.peek()!='[') {
                        return false;
                    }
                    chs.add(c);
                    break;
                case '}':

                    if(chs.size()==0 || chs.peek()!='{' || flag!=1) {
                        return false;
                    }
                    chs.pop();
                    break;
                case ']':
                    if(chs.size()==0 || chs.peek()!='[' || flag!=1) {
                        return false;
                    }
                    chs.pop();
                    break;
                case ')':
                    if(chs.size()==0 || chs.peek()!='(' || flag!=1) {
                        return false;
                    }
                    chs.pop();
                    break;
                default:
                    break;
            }
        }
        return true;
    }

}

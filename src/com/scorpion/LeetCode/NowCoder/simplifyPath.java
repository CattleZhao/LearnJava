package com.scorpion.LeetCode.NowCoder;

import java.util.Stack;

public class simplifyPath {

    public static String simplifyPath(String path){
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for (String s:parts){
            switch (s){
                case ".":
                    break;
                case "":
                    break;
                case "..":
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                 default:
                     stack.push(s);
            }
        }
        StringBuilder s = new StringBuilder();
        if (stack.isEmpty())return "/";
        while (!stack.isEmpty()){
            s.insert(0,"/"+stack.pop());
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/b./b/../../c/"));
    }

}

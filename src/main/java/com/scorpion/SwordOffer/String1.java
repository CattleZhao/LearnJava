package com.scorpion.SwordOffer;

public class String1 {
    public static String replaceSpace(StringBuffer str) {
        int countSpace = 0;
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                countSpace++;
        }
        int newStringLength = str.length() + 2 * countSpace;
        str.setLength(newStringLength);
        int old_index = length - 1;
        int new_index = newStringLength - 1;
        while (old_index >= 0 && old_index < new_index) {
            if (str.charAt(old_index) == ' ') {
                str.setCharAt(new_index--, '0');
                str.setCharAt(new_index--, '2');
                str.setCharAt(new_index--, '%');
            } else {
                str.setCharAt(new_index--, str.charAt(old_index));
            }
            old_index--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcd abcd");
        System.out.println(replaceSpace(s));
    }
}

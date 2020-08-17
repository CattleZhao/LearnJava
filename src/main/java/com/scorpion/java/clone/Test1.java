package com.scorpion.java.clone;

import java.sql.JDBCType;

public class Test1 {
    public static void main(String[] args) {
        // 原始对象
        Student stud = new Student("杨充", "潇湘剑雨");
        System.out.println("原始对象: " + stud.getName() + " - " + stud.getSubject().getName());

        // 拷贝对象
        Student clonedStud = (Student) stud.clone();
        System.out.println("拷贝对象: " + clonedStud.getName() + " - " + clonedStud.getSubject().getName());

        // 原始对象和拷贝对象是否一样：
        System.out.println("原始对象和拷贝对象是否一样: " + (stud == clonedStud));
        // 原始对象和拷贝对象的name属性是否一样
        System.out.println("原始对象和拷贝对象的name属性是否一样: " + (stud.getName() == clonedStud.getName()));
        // 原始对象和拷贝对象的subj属性是否一样
        System.out.println("原始对象和拷贝对象的subj属性是否一样: " + (stud.getSubject() == clonedStud.getSubject()));

        stud.getSubject().setName("aaaaaaaaa");
        System.out.println("原始对象: " + stud.getSubject().getName());
        System.out.println("原始对象: " + clonedStud.getSubject().getName());

    }
}

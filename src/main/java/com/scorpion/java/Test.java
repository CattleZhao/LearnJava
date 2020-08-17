package com.scorpion.java;

import java.util.HashMap;

public class Test {
    public static void showKeyValue1(Generic<?> obj) {
        System.out.println("泛型测试,key value is " + obj.getKey());
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Generic<Integer> integerGeneric = new Generic<Integer>(123);
        Generic<Number> numberGeneric = new Generic<Number>(456);
        showKeyValue1(integerGeneric);
        showKeyValue1(numberGeneric);
    }
}

class Generic<T> {
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
    public <E> void show (E t){
        System.out.println(t.toString());
    }
}

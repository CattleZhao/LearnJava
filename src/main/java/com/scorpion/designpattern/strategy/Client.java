package com.scorpion.designpattern.strategy;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Dog[] dogs= {new Dog(1), new Dog(9), new Dog(2)};
        Sorter sorter = new Sorter();
        sorter.sort(dogs, new DogComparator());
        System.out.println(Arrays.toString(dogs));
    }

}

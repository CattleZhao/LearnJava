package com.scorpion.DesignPattern.Strategy;

public class Dog {
    public int weight;

    public Dog(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Dog weight : " + weight);
    }
}

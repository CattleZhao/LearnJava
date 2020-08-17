package com.scorpion.designpattern.observer;

public class ObserverTest {

    public static void main(String[] args) {
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.registerObserver(obs1);
        concreteSubject.registerObserver(obs2);
        concreteSubject.registerObserver(obs3);
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
        concreteSubject.setState(20);
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }

}

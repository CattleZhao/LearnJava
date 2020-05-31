package com.scorpion.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject<T> {
    List<Observer> observers = new ArrayList<>();
    void registerObserver(T obs);
    void removeObserver(T obs);
    void notifyAllObservers();
}

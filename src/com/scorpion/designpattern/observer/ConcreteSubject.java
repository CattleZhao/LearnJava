package com.scorpion.designpattern.observer;

public class ConcreteSubject implements Subject<Observer> {

    private int state;

    public void setState(final int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public int getState() {
        return this.state;
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer obs : observers) {
            obs.update(this);
        }
    }
}

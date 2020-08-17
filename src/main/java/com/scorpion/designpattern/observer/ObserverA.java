package com.scorpion.designpattern.observer;

public class ObserverA implements Observer{
    private int myState;

    public int getMyState() {
        return this.myState;
    }

    public void setMyState(final int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }
}

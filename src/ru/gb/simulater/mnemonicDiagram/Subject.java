package ru.gb.simulater.mnemonicDiagram;

import ru.gb.simulater.users.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    protected void notify(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}


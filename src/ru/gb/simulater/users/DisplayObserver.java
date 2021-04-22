package ru.gb.simulater.users;

import ru.gb.simulater.mnemonicDiagram.Subject;

public class DisplayObserver implements Observer {

    @Override
    public void update(Subject subject, Object arg) {
        System.out.print(arg);
    }
}


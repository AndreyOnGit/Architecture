package ru.gb.simulater.users;

import ru.gb.simulater.mnemonicDiagram.Subject;

public interface Observer {
    void update(Subject subject, Object arg);
}


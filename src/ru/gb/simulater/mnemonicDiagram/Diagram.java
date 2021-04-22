package ru.gb.simulater.mnemonicDiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diagram extends Subject implements StatusCheck {
    public List<StatusCheck> statusChecks = new ArrayList<>();


    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        for (StatusCheck statusCheck : statusChecks) {
            stringBuilder.append(statusCheck.draw());
            if (statusCheck.draw().contains("red")) notify("There are some problems: " + statusCheck.draw());
        }
        return stringBuilder.toString();
    }

    public StatusCheck add(StatusCheck... statusChecks) {
        this.statusChecks.addAll(Arrays.asList(statusChecks));
        return this;
    }

}

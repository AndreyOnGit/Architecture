package ru.gb.simulater.mnemonicDiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diagram implements StatusCheck {
    public List<StatusCheck> statusChecks = new ArrayList<>();


    @Override
    public void draw() {
        for (StatusCheck statusCheck : statusChecks) {
            statusCheck.draw();
        }
    }

    public StatusCheck add(StatusCheck... statusChecks) {
        this.statusChecks.addAll(Arrays.asList(statusChecks));
        return this;
    }

}

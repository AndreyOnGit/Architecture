package ru.gb.simulater.equipments;

import ru.gb.simulater.mnemonicDiagram.StatusCheck;
import ru.gb.simulater.models.Equipment;
import ru.gb.simulater.models.Parameter;

public class UpConverter extends Equipment implements StatusCheck {
    private String model;
    private String serialNumber;
    private Parameter outFrequency;
    private Parameter inFrequency;
    private Parameter frequencyRange;

    public UpConverter(String model, String serialNumber, Parameter outFrequency, Parameter inFrequency, Parameter frequencyRange) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.outFrequency = outFrequency;
        this.inFrequency = inFrequency;
        this.frequencyRange = frequencyRange;
    }

    @Override
    public String toString() {
        return "UpConverter{" +
                "model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", outFrequency=" + outFrequency +
                ", inFrequency=" + inFrequency +
                ", frequencyRange=" + frequencyRange +
                '}';
    }


    public boolean isSwitchOn() {
        //check status, if this equipment is switched on return true
        return true;
    }

    @Override
    public void draw() {
        if (isSwitchOn()) System.out.println("UpConverter is green");
        else System.out.println("UpConverter is red");
    }
}

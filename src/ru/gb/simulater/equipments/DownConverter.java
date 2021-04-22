package ru.gb.simulater.equipments;

import ru.gb.simulater.mnemonicDiagram.StatusCheck;
import ru.gb.simulater.models.Equipment;
import ru.gb.simulater.models.Parameter;

public class DownConverter extends Equipment implements StatusCheck {
    private String model;
    private String serialNumber;
    private Parameter outFrequency;
    private Parameter inFrequency;
    private Parameter frequencyRange;

    public DownConverter(String model, String serialNumber, Parameter outFrequency, Parameter inFrequency, Parameter frequencyRange) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.outFrequency = outFrequency;
        this.inFrequency = inFrequency;
        this.frequencyRange = frequencyRange;
    }

    @Override
    public String toString() {
        return "DownConverter{" +
                "model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", outFrequency=" + outFrequency +
                ", inFrequency=" + inFrequency +
                ", frequencyRange=" + frequencyRange +
                '}';
    }


    @Override
    public String draw() {
        //if DownConverter WO control interface
        return "DownConverter is black";
    }
}

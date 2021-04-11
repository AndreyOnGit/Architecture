package ru.gb.simulater.equipments;

import ru.gb.simulater.models.Equipment;
import ru.gb.simulater.models.Parameter;

public class UpConverter extends Equipment {
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
}

package ru.gb.simulater.models;

import ru.gb.simulater.equipments.DownConverter;


public class DownConverterBuilder extends Equipment implements ConverterBuilder {
    private Parameter outFrequency;
    private Parameter inFrequency;
    private Parameter frequencyRange;

    @Override
    public void setOutFrequency(Parameter outFrequency) {
        this.outFrequency = outFrequency;
    }

    @Override
    public void setInFrequency(Parameter inFrequency) {
        this.inFrequency = inFrequency;
    }

    @Override
    public void setFrequencyRange(Parameter frequencyRange) {
        this.frequencyRange = frequencyRange;
    }


    public DownConverter build() {
        this.setType("DownConverter");
        return new DownConverter(this.getModel(), this.getSerialNumber(), outFrequency, inFrequency, frequencyRange);
    }
}
package ru.gb.simulater.models;

import ru.gb.simulater.equipments.UpConverter;


public class UpConverterBuilder extends Equipment implements ConverterBuilder {
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


    public UpConverter build() {
        this.setType("UpConverter");
        return new UpConverter(this.getModel(), this.getSerialNumber(), outFrequency, inFrequency, frequencyRange);
    }
}

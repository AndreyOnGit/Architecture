package ru.gb.simulater.models;

public interface ConverterBuilder {
    void setOutFrequency(Parameter frequency);

    void setInFrequency(Parameter frequency);

    void setFrequencyRange(Parameter band);
}

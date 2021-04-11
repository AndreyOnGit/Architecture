package ru.gb.simulater;

import ru.gb.simulater.equipments.UpConverter;
import ru.gb.simulater.models.Dimension;
import ru.gb.simulater.models.Parameter;
import ru.gb.simulater.models.UpConverterBuilder;

public class App {
    public static void main(String[] args) {
        mountNewEquipment();
    }

    public static void mountNewEquipment() {
        UpConverterBuilder upConverterBuilder = new UpConverterBuilder();
        upConverterBuilder.setModel("P7000a");
        upConverterBuilder.setSerialNumber("45EY2543");
        upConverterBuilder.setFrequencyRange(new Parameter(100, Dimension.KHZ));
        upConverterBuilder.setInFrequency(new Parameter(70, Dimension.MHZ));
        upConverterBuilder.setOutFrequency(new Parameter(5000, Dimension.MHZ));
        UpConverter upConverter = upConverterBuilder.build();
        System.out.println(upConverter);
    }
}

package ru.gb.simulater;

import ru.gb.simulater.equipments.DownConverter;
import ru.gb.simulater.equipments.UpConverter;
import ru.gb.simulater.mnemonicDiagram.Diagram;
import ru.gb.simulater.mnemonicDiagram.StatusCheck;
import ru.gb.simulater.models.Dimension;
import ru.gb.simulater.models.DownConverterBuilder;
import ru.gb.simulater.models.Parameter;
import ru.gb.simulater.models.UpConverterBuilder;
import ru.gb.simulater.users.DisplayObserver;

public class App {
    public static void main(String[] args) {
        drawMnemonic();
    }

    public static void drawMnemonic() {
        System.out.println("Drawing mnemonic diagram...");
        StatusCheck statusCheckDownConverter = mountDownConverter();
        StatusCheck statusCheckUpConverter = mountUpConverter();
        Diagram diagram = new Diagram();
        attachDisplayObserver(diagram);
        StatusCheck statusChecks = diagram.add(statusCheckUpConverter, statusCheckDownConverter);
        statusChecks.draw();
    }

    public static UpConverter mountUpConverter() {
        UpConverterBuilder upConverterBuilder = new UpConverterBuilder();
        upConverterBuilder.setModel("P7000a");
        upConverterBuilder.setSerialNumber("45EY2543");
        upConverterBuilder.setFrequencyRange(new Parameter(100, Dimension.KHZ));
        upConverterBuilder.setInFrequency(new Parameter(70, Dimension.MHZ));
        upConverterBuilder.setOutFrequency(new Parameter(5000, Dimension.MHZ));
        UpConverter upConverter = upConverterBuilder.build();
        return upConverter;
    }

    public static DownConverter mountDownConverter() {
        DownConverterBuilder downConverterBuilder = new DownConverterBuilder();
        downConverterBuilder.setModel("P7003");
        downConverterBuilder.setSerialNumber("60FE8537");
        downConverterBuilder.setFrequencyRange(new Parameter(100, Dimension.KHZ));
        downConverterBuilder.setInFrequency(new Parameter(7000, Dimension.MHZ));
        downConverterBuilder.setOutFrequency(new Parameter(70, Dimension.MHZ));
        DownConverter downConverter = downConverterBuilder.build();
        return downConverter;
    }

    public static void attachDisplayObserver(Diagram diagram) {
        diagram.attach(new DisplayObserver());
    }


}

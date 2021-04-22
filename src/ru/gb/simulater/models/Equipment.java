package ru.gb.simulater.models;

public abstract class Equipment {
    private String type;
    private String model;
    private String serialNumber;

    public String getModel() {
        return model;
    }

    public void setModel(String title) {
        this.model = title;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

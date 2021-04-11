package ru.gb.simulater.models;

public class Parameter {
    private String description;
    private double value;
    private Dimension dimension;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Parameter(String description, double value, Dimension dimension) {
        this.description = description;
        this.value = value;
        this.dimension = dimension;
    }

    public Parameter(double value, Dimension dimension) {
        this.description = "WO";
        this.value = value;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "description='" + description + '\'' +
                ", value=" + value +
                ", dimension=" + dimension +
                '}';
    }

    //todo comparison
}

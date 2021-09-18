package com.javalearning;

import java.awt.*;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;


    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton() {
        System.out.println("Power Button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }
}

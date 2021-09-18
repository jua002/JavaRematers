package com.javalearning;

public class Cylinder extends Circle{

    //field
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

        if (height < 0) {
            this.height = 0;
        }
    }

    //getters
    public double getHeight() {
        return height;
    }

    //new methods
    public double getVolume() {
        return (getArea() * height );
    }


}

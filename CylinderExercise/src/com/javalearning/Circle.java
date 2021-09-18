package com.javalearning;

public class Circle {

    //fields
    private double radius;


    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //getters
    public double getRadius() {
        return radius;
    }


    //new methods
    public double getArea() {
        return (radius * radius * (Math.PI));
    }
}

package com.javalearning;

public class Car extends Vehicle {

    //fields
    private int doors;
    private int engineCapacity;


    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

package com.javalearning;

class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }
    public String brake() {
        return "Car -> brake()";
    }
}

class Lexus extends Car {

    public Lexus(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Lexus -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Lexus -> accelerate()";
    }

    @Override
    public String brake() {
        return "Lexus -> brake()";
    }
}

class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Honda extends Car {

    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> break()";
    }
}
class Toyota extends Car {

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Lexus lexus = new Lexus("LX", 6);
        System.out.println(lexus.startEngine());
        System.out.println(lexus.accelerate());
        System.out.println(lexus.brake());

        Ford ford = new Ford("Fusion", 4);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Honda honda = new Honda("Accord", 6);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());

        Toyota toyota = new Toyota("Avalon", 6);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());


    }


}

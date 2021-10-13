package com.javalearning;

public class HealthyBurger extends Hamburger{

    private String healthExtra1Name;
    private double healthyExtra1Price;

    private String healthExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;

    }
}

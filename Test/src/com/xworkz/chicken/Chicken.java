package com.xworkz.chicken;

public class Chicken {
    double price;
    String location;

    public Chicken(double price, String location) {
        this.price = price;
        this.location = location;
    }

    public void printInfo() {
        System.out.println("Price: " + price);
        System.out.println("Location: " + location);
    }
}
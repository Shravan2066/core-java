package com.xworkz.superChaining;

public class Car extends Vehicle {
    String model;

    Car(String manufacturer, String model) {
        super(manufacturer);
        this.model = model;
        System.out.println("Car constructor called");
        
    }
    void displayDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);

    }
}

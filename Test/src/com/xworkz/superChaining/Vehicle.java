package com.xworkz.superChaining;

public class Vehicle {
    String manufacturer;

    Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
        System.out.println("Vehicle constructor called");
    }
    void displayDetails() {
        System.out.println("Manufacturer: " + manufacturer);
    }
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 75);
        electricCar.displayDetails();
    }
}

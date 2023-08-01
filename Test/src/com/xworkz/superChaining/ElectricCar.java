package com.xworkz.superChaining;

public class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String manufacturer, String model, int batteryCapacity) {
        super(manufacturer, model); 
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
        
    }
    void displayDetails() {
        System.out.println("Manufacturer: " + manufacturer);
   System.out.println("Model: " + model);
       System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

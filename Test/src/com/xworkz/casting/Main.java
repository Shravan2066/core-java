package com.xworkz.casting;

public class Main {
    public static void main(String[] args) {
        ElectricDevice device1 = new Laptop();
        ElectricDevice device2 = new Smartphone();

        // Object casting to access subclass-specific methods
        if (device1 instanceof Laptop) {
            Laptop laptop = (Laptop) device1;
            laptop.browseInternet();
        } else {
            System.out.println("device1 is not a Laptop");
        }

        // Object casting to access subclass-specific methods
        if (device2 instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) device2;
            smartphone.makeCall();
        } else {
            System.out.println("device2 is not a Smartphone");
        }
    }
}

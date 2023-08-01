package com.xworkz.casting;

public class Smartphone extends ElectricDevice {
    @Override
    void turnOn() {
        System.out.println("Smartphone turned on");
    }

    void makeCall() {
        System.out.println("Smartphone making a call");
    }
}

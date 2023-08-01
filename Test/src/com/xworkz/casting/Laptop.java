package com.xworkz.casting;

public class Laptop extends ElectricDevice {
    @Override
    void turnOn() {
        System.out.println("Laptop turned on");
    }

    void browseInternet() {
        System.out.println("Laptop browsing the internet");
    }
}

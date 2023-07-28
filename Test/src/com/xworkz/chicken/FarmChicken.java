package com.xworkz.chicken;

public class FarmChicken extends Chicken {
    int noOfDays;
    String careTaker;

    public FarmChicken(double price, String location, int noOfDays, String careTaker) {
        super(price, location);
        this.noOfDays = noOfDays;
        this.careTaker = careTaker;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("No. of Days at Farm: " + noOfDays);
        System.out.println("Care Taker: " + careTaker);
    }
}
package com.xworkz.chicken;

class BroilerChicken extends Chicken {
    boolean isAlive;
    double weight;

    public BroilerChicken(double price, String location, boolean isAlive, double weight) {
        super(price, location);
        this.isAlive = isAlive;
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Is Alive: " + isAlive);
        System.out.println("Weight: " + weight + " kg");
    }
}
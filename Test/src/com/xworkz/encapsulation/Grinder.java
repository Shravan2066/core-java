package com.xworkz.encapsulation;

public class Grinder {
    private String brand;
    private int powerRating;
    private boolean hasSafetyLock;
    private int capacityInGrams;
    private double price;

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public boolean isHasSafetyLock() {
        return hasSafetyLock;
    }

    public int getCapacityInGrams() {
        return capacityInGrams;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPowerRating(int powerRating) {
        this.powerRating = powerRating;
    }

    public void setHasSafetyLock(boolean hasSafetyLock) {
        this.hasSafetyLock = hasSafetyLock;
    }

    public void setCapacityInGrams(int capacityInGrams) {
        this.capacityInGrams = capacityInGrams;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Grinder{" +
                "brand='" + brand + '\'' +
                ", powerRating=" + powerRating +
                ", hasSafetyLock=" + hasSafetyLock +
                ", capacityInGrams=" + capacityInGrams +
                ", price=" + price +
                '}';
    }
}

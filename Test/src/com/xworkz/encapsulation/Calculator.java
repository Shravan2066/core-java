package com.xworkz.encapsulation;

public class Calculator {
    private String brand;
    private String model;
    private boolean isScientific;
    private boolean isSolarPowered;
    private double price;

    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isScientific() {
        return isScientific;
    }

    public boolean isSolarPowered() {
        return isSolarPowered;
    }

    public double getPrice() {
        return price;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setScientific(boolean scientific) {
        isScientific = scientific;
    }

    public void setSolarPowered(boolean solarPowered) {
        isSolarPowered = solarPowered;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Calculator{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isScientific=" + isScientific +
                ", isSolarPowered=" + isSolarPowered +
                ", price=" + price +
                '}';
    }
}

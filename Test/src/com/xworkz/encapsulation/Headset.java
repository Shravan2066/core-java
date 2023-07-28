package com.xworkz.encapsulation;

public class Headset {
    private String brand;
    private String model;
    private boolean isWireless;
    private boolean hasMicrophone;
    private double price;

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public boolean isHasMicrophone() {
        return hasMicrophone;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public void setHasMicrophone(boolean hasMicrophone) {
        this.hasMicrophone = hasMicrophone;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Headset{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isWireless=" + isWireless +
                ", hasMicrophone=" + hasMicrophone +
                ", price=" + price +
                '}';
    }
}

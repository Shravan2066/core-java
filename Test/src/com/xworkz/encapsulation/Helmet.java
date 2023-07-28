package com.xworkz.encapsulation;

public class Helmet {
    private String brand;
    private String size;
    private String color;
    private boolean isFullFace;
    private double price;

    
    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isFullFace() {
        return isFullFace;
    }

    public double getPrice() {
        return price;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFullFace(boolean fullFace) {
        isFullFace = fullFace;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Helmet{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", isFullFace=" + isFullFace +
                ", price=" + price +
                '}';
    }
}


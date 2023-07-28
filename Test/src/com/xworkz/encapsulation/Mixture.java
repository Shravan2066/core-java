package com.xworkz.encapsulation;
public class Mixture {
    private String brand;
    private String flavor;
    private boolean isSpicy;
    private double weightInGrams;
    private double price;

 

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Mixture{" +
                "brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                ", isSpicy=" + isSpicy +
                ", weightInGrams=" + weightInGrams +
                ", price=" + price +
                '}';
    }
}

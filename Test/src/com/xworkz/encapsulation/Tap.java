package com.xworkz.encapsulation;
public class Tap {
    private String type;
    private String material;
    private boolean hasHotWaterOption;
    private boolean hasFilter;
    private double price;

    // Getters
    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isHasHotWaterOption() {
        return hasHotWaterOption;
    }

    public boolean isHasFilter() {
        return hasFilter;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHasHotWaterOption(boolean hasHotWaterOption) {
        this.hasHotWaterOption = hasHotWaterOption;
    }

    public void setHasFilter(boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Tap{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", hasHotWaterOption=" + hasHotWaterOption +
                ", hasFilter=" + hasFilter +
                ", price=" + price +
                '}';
    }
}

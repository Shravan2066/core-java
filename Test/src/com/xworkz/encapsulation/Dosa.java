package com.xworkz.encapsulation;

public class Dosa {
    private String type;
    private String ingredients;
    private double price;
    private boolean isSpicy;
    private int quantityAvailable;

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    @Override
    public String toString() {
        return "Dosa{" +
                "type='" + type + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", price=" + price +
                ", isSpicy=" + isSpicy +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}


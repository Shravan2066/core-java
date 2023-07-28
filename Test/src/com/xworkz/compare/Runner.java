package com.xworkz.compare;

public class Runner {
    public static void main(String[] args) {
        Grocery groceryItem = new Grocery("Apple", "Fruits");
        Assets assetItem = new Assets("Laptop", 1200.0, "Home");
        Gold goldItem = new Gold(10.5, 22.0, true, 60.0);
        Vehicle vehicleItem = new Vehicle("Toyota", "Camry", 2022, "Silver", 15000.5);
        DryFruit dryFruitItem = new DryFruit("Almonds", "California", 25.0, 100, true, "2023-12-31");
        Slipper slipperItem = new Slipper("Nike", "Large", "Black", "Rubber", 29.99, true, "Unisex");

        Grocery groceryItem2 = new Grocery("Apple", "Fruits");

        boolean groceryEqual = groceryItem.equals(groceryItem2);
        System.out.println("Are both the grocery objects equal? " + groceryEqual);

        boolean assetEqual = assetItem.equals(new Assets("Televison", 2200.0, "Home"));
        System.out.println("Are both the asset objects equal? " + assetEqual);

        boolean goldEqual = goldItem.equals(new Gold(10.5, 22.0, true, 60.0));
        System.out.println("Are both the gold objects equal? " + goldEqual);

        boolean vehicleEqual = vehicleItem.equals(new Vehicle("Dodge", "Viper", 2020, "Black", 19000.5));
        System.out.println("Are both the vehicle objects equal? " + vehicleEqual);

        boolean dryFruitEqual = dryFruitItem.equals(new DryFruit("Almonds", "California", 25.0, 100, true, "2023-12-31"));
        System.out.println("Are both the dry fruit objects equal? " + dryFruitEqual);

        boolean slipperEqual = slipperItem.equals(new Slipper("Nike", "Large", "Black", "Rubber", 29.99, true, "Unisex"));
        System.out.println("Are both the slipper objects equal? " + slipperEqual);

    }
}


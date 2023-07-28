package com.xworkz.compare;

public class Slipper {
    private String brand;
    private String size;
    private String color;
    private String material;
    private double price;
    private boolean waterproof; // New variable
    private String gender; // New variable

    // Constructor
    public Slipper(String brand, String size, String color, String material, double price, boolean waterproof, String gender) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
        this.waterproof = waterproof;
        this.gender = gender;
    }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null) {
                System.out.println("Object is null");
                return false;
            }
            if (!(object instanceof Slipper)) {
                return false;
            }

            Slipper slipper = (Slipper) object;

            return this.brand.equals(slipper.brand) && this.size.equals(slipper.size);
        }

    
}


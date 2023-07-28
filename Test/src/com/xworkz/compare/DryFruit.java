package com.xworkz.compare;

public class DryFruit {
    private String name;
    private String origin;
    private double pricePerKg;
    private int quantity;
    private boolean organic;
    private String bestBeforeDate; // New variable

    // Constructor
    public DryFruit(String name, String origin, double pricePerKg, int quantity, boolean organic, String bestBeforeDate) {
        this.name = name;
        this.origin = origin;
        this.pricePerKg = pricePerKg;
        this.quantity = quantity;
        this.organic = organic;
        this.bestBeforeDate = bestBeforeDate;
    }


        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null) {
                System.out.println("Object is null");
                return false;
            }
            if (!(object instanceof DryFruit)) {
                return false;
            }

            DryFruit dryFruit = (DryFruit) object;

            return this.name.equals(dryFruit.name) && this.origin.equals(dryFruit.origin);
        }

   
}

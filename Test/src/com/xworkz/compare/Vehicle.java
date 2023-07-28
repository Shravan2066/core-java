package com.xworkz.compare;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String color;
    private double mileage;

    
    public Vehicle(String make, String model, int year, String color, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null) {
                System.out.println("Object is null");
                return false;
            }
            if (!(object instanceof Vehicle)) {
                return false;
            }

            Vehicle vehicle = (Vehicle) object;

            return this.make.equals(vehicle.make) && this.model.equals(vehicle.model);
        }

       
}

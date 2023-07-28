package com.xworkz.encapsulation;

public class Satellite {
    private String name;
    private String orbitType;
    private double weight;
    private int launchYear;
    private boolean isOperational;

    
    public String getName() {
        return name;
    }

    public String getOrbitType() {
        return orbitType;
    }

    public double getWeight() {
        return weight;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public boolean isOperational() {
        return isOperational;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setOrbitType(String orbitType) {
        this.orbitType = orbitType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    
    @Override
    public String toString() {
        return "Satellite{" +
                "name='" + name + '\'' +
                ", orbitType='" + orbitType + '\'' +
                ", weight=" + weight +
                ", launchYear=" + launchYear +
                ", isOperational=" + isOperational +
                '}';
    }
}

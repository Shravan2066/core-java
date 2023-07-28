package com.xworkz.chicken;

public class Main {
    public static void main(String[] args) {
    	Chicken chicken= new Chicken(5.0,"Farm A");
        FarmChicken farmChicken = new FarmChicken(10.0, "Farm A", 20, "John");
        BroilerChicken broilerChicken = new BroilerChicken(8.0, "Farm B", true, 2.5);
        
        System.out.println("Chicken Info:");
        chicken.printInfo();
        
        System.out.println("\nFarm Chicken Info:");
        farmChicken.printInfo();

        System.out.println("\nBroiler Chicken Info:");
        broilerChicken.printInfo();
    }
}
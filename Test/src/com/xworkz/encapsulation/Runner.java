package com.xworkz.encapsulation;

public class Runner {
    public static void main(String[] args) {
      
        Dosa dosa = new Dosa();
        dosa.setType("Masala Dosa");
        dosa.setIngredients("Rice, Lentils, Spices");
        dosa.setPrice(6.99);
        dosa.setSpicy(true);
        dosa.setQuantityAvailable(50);

        Satellite satellite = new Satellite();
        satellite.setName("GPS Satellite");
        satellite.setOrbitType("Geostationary");
        satellite.setWeight(5000.0);
        satellite.setLaunchYear(2010);
        satellite.setOperational(true);

        Calculator calculator = new Calculator();
        calculator.setBrand("Casio");
        calculator.setModel("Scientific");
        calculator.setScientific(true);
        calculator.setSolarPowered(false);
        calculator.setPrice(19.99);

        Grinder grinder = new Grinder();
        grinder.setBrand("Philips");
        grinder.setPowerRating(750);
        grinder.setHasSafetyLock(true);
        grinder.setCapacityInGrams(200);
        grinder.setPrice(35.99);

        Helmet helmet = new Helmet();
        helmet.setBrand("Vega");
        helmet.setSize("Large");
        helmet.setColor("Black");
        helmet.setFullFace(true);
        helmet.setPrice(49.99);

        Tap tap = new Tap();
        tap.setType("Kitchen");
        tap.setMaterial("Stainless Steel");
        tap.setHasHotWaterOption(true);
        tap.setHasFilter(false);
        tap.setPrice(24.99);

        Headset headset = new Headset();
        headset.setBrand("Sony");
        headset.setModel("WH-1000XM4");
        headset.setWireless(true);
        headset.setHasMicrophone(true);
        headset.setPrice(249.99);

        Newspaper newspaper = new Newspaper();
        newspaper.setName("The Daily Times");
        newspaper.setPublisher("Times Media");
        newspaper.setLanguage("English");
        newspaper.setTotalPages(24);
        newspaper.setDatePublished("2023-07-27");

        Mixture mixture = new Mixture();
        mixture.setBrand("Haldiram's");
        mixture.setFlavor("Spicy Mix");
        mixture.setSpicy(true);
        mixture.setWeightInGrams(200);
        mixture.setPrice(4.99);

        // Printing the values of each item using their toString methods
        System.out.println("Dosa: " + dosa);
        System.out.println("Satellite: " + satellite);
        System.out.println("Calculator: " + calculator);
        System.out.println("Grinder: " + grinder);
        System.out.println("Helmet: " + helmet);
        System.out.println("Mixture: " + mixture);
        System.out.println("Tap: " + tap);
        System.out.println("Headset: " + headset);
        System.out.println("Newspaper: " + newspaper);
        System.out.println("Indian Mixture: " + mixture);
    }
}

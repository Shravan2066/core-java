package com.xworkz.diamond;

public class EngineRunner {
	public static void main(String[] args) {
        Car car = new Car();

        // Using the direct instance of class Car
        car.start();  // Output: "Combustion engine starting..."

        // Using parent type Engine
        Engine engine = new Car();
        engine.start();  // Output: "Combustion engine starting..."

        // Using parent type ElectricEngine
        ElectricEngine electricEngine = new Car();
        electricEngine.start();  // Output: "Combustion engine starting..."

        // Using parent type CombustionEngine
        CombustionEngine combustionEngine =new Car();
        combustionEngine.start();  // Output: "Combustion engine starting..."
    }
}

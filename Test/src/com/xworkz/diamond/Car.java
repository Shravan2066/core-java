package com.xworkz.diamond;

public class Car implements ElectricEngine, CombustionEngine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car engine starting");
	}

}

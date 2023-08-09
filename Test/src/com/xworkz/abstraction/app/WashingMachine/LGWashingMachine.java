package com.xworkz.abstraction.app.WashingMachine;

public class LGWashingMachine implements WashngMachine{

	@Override
	public boolean wash(int items) {
		// TODO Auto-generated method stub
		System.out.println("washing"+items+"items");
		return true;
	}

	@Override
	public boolean dry() {
		// TODO Auto-generated method stub
		System.out.println("drying");
		return true;
	}

}

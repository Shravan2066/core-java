package com.xworkz.test;

public class FamilyCourt extends CivilCourt {

@Override
public void propertyCase() {
	System.out.println("Invoking propertyCase in FamilyCourt");
}
	@Override
	public void theftCase() {
		System.out.println("Invoking theftCase in FamilyCourt");
	}
	public void divorce() {
		System.out.println("Invoking divorce in FamilyCourt");
	}
}
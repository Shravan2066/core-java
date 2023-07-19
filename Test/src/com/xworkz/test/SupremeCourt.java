package com.xworkz.test;

public class SupremeCourt extends Court {

	@Override
	public void justice() {
		System.out.println("Invoking justice method in SupremeCourt");
	}
	public void importantCase() {
		System.out.println("Invoking importantCase in SupremeCourt");
	}
}

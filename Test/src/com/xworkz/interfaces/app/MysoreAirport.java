package com.xworkz.interfaces.app;

public class MysoreAirport implements AirportRules{
	
	@Override
	public void securityCheck() {
		// TODO Auto-generated method stub
		System.out.println("check passed");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("checked in");
	}
}

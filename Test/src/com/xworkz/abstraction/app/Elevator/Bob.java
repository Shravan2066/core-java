package com.xworkz.abstraction.app.Elevator;

public class Bob {
private Elevator elevator;
public Bob(Elevator elevator) {
	this.elevator=elevator;
}
public void getCarryLuggage() {
	if(elevator!=null) {
		elevator.carryLuggage();
	}
	else {
		System.out.println("Elevator is null");
	}
}
}

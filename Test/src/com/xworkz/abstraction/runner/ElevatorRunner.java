package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.app.Elevator.*;

public class ElevatorRunner {
	public static void main(String[] args) {
	Elevator elevator=new ApartmentElevator();
	Bob bob=new Bob(elevator);
	bob.getCarryLuggage();
}
}

package com.xworkz.interfaces.runner;
import com.xworkz.interfaces.app.*;
public class InterfacesRunner {
public static void main() {
	MysoreAirport airport=new MysoreAirport();
	System.out.println(airport.maxCarryOnBags);
	airport.securityCheck();
	airport.checkIn();
	
	AppleRules apple=new AppleRules();
	System.out.println(apple.minWorkingHours);
	apple.attendMeeting();
	apple.submitReport();
	
	SBIRules sbi= new SBIRules();
	System.out.println(sbi.minimumBalance);
	sbi.deposit();
	sbi.withdraw();
	
	NammaMetroRules metro=new NammaMetroRules();
	System.out.println(metro.name);
	metro.buyTicket();
	metro.enterStation();
	
	IndianArmy army= new IndianArmy();
	System.out.println(army.armyName);
	army.defend();
	army.performDrill();
	
	HouseRules house=new HouseRules();
	System.out.println(house.hasAlarmSystem);
	house.lock();
	house.unlock();
	
	TajHotel hotel=new TajHotel();
	System.out.println(hotel.maxSeats);
	hotel.serveFood();
	hotel.calculateBill();
	
}
}

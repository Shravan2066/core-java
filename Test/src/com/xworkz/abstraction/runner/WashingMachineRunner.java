package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.app.WashingMachine.*;
public class WashingMachineRunner {
public static void Main(String[] args) {
	WashngMachine washingMachine=new LGWashingMachine();
	YuvrajSingh ambassador=new YuvrajSingh(washingMachine);
	ambassador.wash(10);
	ambassador.dry();
}
}

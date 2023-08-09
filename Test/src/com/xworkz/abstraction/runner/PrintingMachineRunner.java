package com.xworkz.abstraction.runner;


import com.xworkz.abstraction.app.printingMachine.*;

public class PrintingMachineRunner {
	public static void main(String[] args) {
	PrintingMachine printer=new HPPrinter();
	DeepikaPadukone ambassador=new DeepikaPadukone(printer);
	ambassador.printDocument();
}
}

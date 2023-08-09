package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Kidney.*;

public class KidneyRunner {
	public static void main(String[] args) {
		Kidney kidney=new FunctionalKidney();
		Patient patient=new Patient(kidney);
		patient.cleanBlood();
}
}

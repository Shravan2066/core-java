package com.xworkz.abstraction.app.Kidney;

public class Patient extends FunctionalKidney {
	 private Kidney kidney;

	    public Patient(Kidney kidney) {
	        this.kidney = kidney;
	    }

	    public void performBloodCleaning() {
	        if (kidney != null) {
	            kidney.cleanBlood();
	        } else {
	            System.out.println("Kidney is null");
	        }
	    }
}

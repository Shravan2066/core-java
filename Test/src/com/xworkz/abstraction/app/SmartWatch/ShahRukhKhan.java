package com.xworkz.abstraction.app.SmartWatch;

public class ShahRukhKhan extends AppleSmartWatch {
	 private SmartWatch smartwatch;

	    public ShahRukhKhan(SmartWatch smartwatch) {
	        this.smartwatch = smartwatch;
	    }

	    public void displayTime() {
	        if (smartwatch != null) {
	            smartwatch.showTime();
	        } else {
	            System.out.println("Smartwatch is null");
	        }
	    }
}

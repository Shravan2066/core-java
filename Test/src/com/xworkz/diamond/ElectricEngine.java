package com.xworkz.diamond;

public interface ElectricEngine extends Engine {
	   default void start() {
	        System.out.println("Electric engine starting...");
	    }
}

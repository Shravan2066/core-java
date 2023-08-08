package com.xworkz.diamond;

public interface CombustionEngine extends Engine {
	 default void start() {
	        System.out.println("Combustion engine starting...");
	    }
}

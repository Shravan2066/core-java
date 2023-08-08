package com.xworkz.diamond;

public interface Engine {
	   default void start() {
	        System.out.println("Engine starting...");
	    }
}

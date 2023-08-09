package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.SmartWatch.*;
public class SmartWatchRunner {
	public static void main(String[] args) {
		SmartWatch smartwatch=new AppleSmartWatch() ;
		ShahRukhKhan ambassador=new ShahRukhKhan(smartwatch);
		ambassador.displayTime();

}}

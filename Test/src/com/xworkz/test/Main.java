package com.xworkz.test;

public class Main {
	public static void main(String[] args) {
		Court court=new Court();
		court.justice();
		Court supremeCourt=new SupremeCourt();
		supremeCourt.justice();
		SupremeCourt supremecourt1=new SupremeCourt();
		supremeCourt.justice();
		supremecourt1.importantCase();
		
		Court highCourt=new HighCourt();
		highCourt.justice();
		SupremeCourt highCourt2=new HighCourt();
		highCourt2.importantCase();
		HighCourt highCourt3=new HighCourt();
		highCourt3.importantCase();
		highCourt3.criminalCase();
		highCourt3.forgeryCase();
		
		Court civilCourt=new CivilCourt();
		civilCourt.justice();
		SupremeCourt civilCourt2=new CivilCourt();
		civilCourt2.importantCase();
		HighCourt civilCourt3=new CivilCourt();
		civilCourt3.criminalCase();
		civilCourt3.forgeryCase();
		CivilCourt civilCourt4=new CivilCourt();
		civilCourt4.criminalCase();
		civilCourt4.forgeryCase();
		civilCourt4.propertyCase();
		civilCourt4.theftCase();
		
		Court familyCourt=new FamilyCourt();
		familyCourt.justice();
		SupremeCourt familyCourt2=new FamilyCourt();
		familyCourt2.importantCase();
		HighCourt familyCourt3=new FamilyCourt();
		familyCourt3.criminalCase();
		familyCourt3.forgeryCase();
		CivilCourt familyCourt4=new FamilyCourt();
		familyCourt4.propertyCase();
		familyCourt4.theftCase();
		FamilyCourt familyCourt5=new FamilyCourt();
		familyCourt5.propertyCase();
		familyCourt5.theftCase();
		familyCourt5.divorce();
		
	}
}

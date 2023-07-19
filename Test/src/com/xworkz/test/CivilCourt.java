package com.xworkz.test;

public class CivilCourt extends HighCourt {
@Override
public void criminalCase() {
	System.out.println("Invoking criminalCase in CvilCourt");
}
@Override
	public void forgeryCase() {
	System.out.println("Invoking forgeryCase in CvilCourt");
}
public void propertyCase() {
System.out.println("Invoking propertyCase in CvilCourt");
}
public void theftCase() {
System.out.println("Invoking theftCase in CvilCourt");
}
}

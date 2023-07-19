package com.xworkz.shoe;

public class Main {
public static void main(String[] args) {
	NikeShoe shoe1=new NikeShoe(30000, ShoeSize.SMALL, ShoeColor.BLUE, "John Donahoe", "Ronaldo");
	PumaShoe shoe2=new PumaShoe(40000, ShoeSize.LARGE, ShoeColor.RED, "A3", "USA");
	ShoeUtil shoe=new ShoeUtil();
	shoe.buy(shoe1);
}
}

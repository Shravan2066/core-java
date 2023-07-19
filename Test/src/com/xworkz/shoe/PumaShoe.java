package com.xworkz.shoe;

public class PumaShoe extends Shoe {
public String model;
public String origin;

public PumaShoe(int price,ShoeSize size,ShoeColor color,String model,String origin) {
this.price=price;
this.size=size;
this.color=color;
this.model=model;
this.origin=origin;
}
public void printInfo() {
	System.out.println(price);
	System.out.println(size);
	System.out.println(color);
	System.out.println(model);
	System.out.println(origin);
}
}

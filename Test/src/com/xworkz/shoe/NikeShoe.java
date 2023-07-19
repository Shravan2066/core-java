package com.xworkz.shoe;

public class NikeShoe extends Shoe {
	public String ceo;
	public String brandAmbassador;

	public NikeShoe(int price,ShoeSize size,ShoeColor color,String ceo,String brandAmbassador) {
	this.price=price;
	this.size=size;
	this.color=color;
	this.ceo=ceo;
	this.brandAmbassador=brandAmbassador;
	}
	public void printInfo() {
		System.out.println(price);
		System.out.println(size);
		System.out.println(color);
		System.out.println(ceo);
		System.out.println(brandAmbassador);
	}
}

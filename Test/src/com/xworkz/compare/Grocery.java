package com.xworkz.compare;

public class Grocery {
	private String name;
	private String category;

	
	public Grocery(){};
	public Grocery(String name, String category) {
		this.name = name;
		this.category = category;

	}
	
	public boolean equals(Object object) {
		if(object==null) {
			System.out.println("Object is null");
			return false;
		}
			if(this==object) {
				return true;
			}
			if(!(object instanceof Grocery)) {
				return false;
			}
			Grocery grocery=(Grocery) object;
			return this.name.equals(grocery.name) && this.category.equals(grocery.category);
		}
	}
	
	


package com.xworkz.diamondProblem;

public class CoolDrinkRunner {
	public static void main() {
CokeCoolDrink coke= new BTMCoolDrink();
coke.stamina();
coke.cool();

PepsiCoolDrink pepsi= new BTMCoolDrink();
pepsi.cool();
pepsi.energy();

CoolDrink drink=new BTMCoolDrink();
drink.cool();

BTMCoolDrink btm= new BTMCoolDrink();
btm.cool();
btm.energy();
btm.stamina();
	}
}

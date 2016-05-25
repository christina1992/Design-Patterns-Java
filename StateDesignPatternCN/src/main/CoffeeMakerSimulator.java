package main;

import objects.CoffeeMakerMachine;

public class CoffeeMakerSimulator {

	public static void main(String[] args) {
		CoffeeMakerMachine maker = new CoffeeMakerMachine();

		System.out.println(maker);

		maker.insertMoney();
		maker.makingCoffee();
		
		 System.out.println(maker);
		
		 maker.insertMoney();
		 maker.makingCoffee();
		 maker.insertMoney();
		 maker.makingCoffee();
		
		 System.out.println(maker);
	}

}

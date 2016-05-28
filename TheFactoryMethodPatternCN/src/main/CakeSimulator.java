package main;

import abstract_objects.Cake;
import abstract_objects.CakeStore;
import objects.ChocolateCakeStore;
import objects.VanillaCakeStore;

public class CakeSimulator {

	public static void main(String[] args) {
		CakeStore vanilla = new VanillaCakeStore();
		CakeStore chocolate = new ChocolateCakeStore();

		Cake cake = vanilla.orderCake("vegan");
		System.out.println("Christina ordered a " + cake.getName() + "\n");

		cake = chocolate.orderCake("fruits");
		System.out.println("Phlip ordered a " + cake.getName() + "\n");

		cake = vanilla.orderCake("cheesecake");
		System.out.println("Homer ordered a " + cake.getName() + "\n");

		cake = chocolate.orderCake("muffin");
		System.out.println("Christina ordered a " + cake.getName() + "\n");

		cake = chocolate.orderCake("fruits");
		System.out.println("Philip ordered a " + cake.getName() + "\n");

	}

}

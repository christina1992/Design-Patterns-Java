package main;

import abstract_objects.Cake;
import objects.CakeFactory;
import objects.CakeStore;

public class CakeSimulator {
	public static void main(String[] args) {
		CakeFactory factory = new CakeFactory();
		CakeStore store = new CakeStore(factory);

		Cake cake = store.orderPizza("vanilla");
		System.out.println("We ordered a " + cake.getName() + "\n");
		System.out.println(cake);
 
		cake = store.orderPizza("chocolate");
		System.out.println("We ordered a " + cake.getName() + "\n");
		System.out.println(cake);
	}
}

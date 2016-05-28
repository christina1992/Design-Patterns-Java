package objects;

import abstract_objects.Cake;

public class VanillaVeganCake extends Cake {
	public VanillaVeganCake() {
		name = "Vanilla Vegan Cake";
		dough = "Soft Dough";
		cream = "Frutty Cream";

		toppings.add("Bannanas");
		toppings.add("Strawberries");
	}

	public void decorate() {
		System.out.println("Adding the vanilla cream");
	}
}

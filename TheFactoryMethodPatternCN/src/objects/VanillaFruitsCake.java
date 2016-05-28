package objects;

import abstract_objects.Cake;

public class VanillaFruitsCake extends Cake {
	public VanillaFruitsCake() {
		name = "Vanilla Fruits Cake";
		dough = "Soft Dough";
		cream = "Frutty Cream";

		toppings.add("Cherries");
		toppings.add("Bannanas");
		toppings.add("Strawberries");
	}

	public void decorate() {
		System.out.println("Adding the extra fruits");
	}
}

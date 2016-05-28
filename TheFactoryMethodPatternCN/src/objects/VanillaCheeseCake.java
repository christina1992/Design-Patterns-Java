package objects;

import abstract_objects.Cake;

public class VanillaCheeseCake extends Cake {
	public VanillaCheeseCake() {
		name = "Vanilla Cheese Cake";
		dough = "Soft Dough";
		cream = "Cherry Cream";

		toppings.add("Cherries");
	}

	public void decorate() {
		System.out.println("Adding the extra cherries");
	}
}

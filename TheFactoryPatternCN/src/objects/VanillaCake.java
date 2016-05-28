package objects;

import abstract_objects.Cake;

public class VanillaCake extends Cake {
	public VanillaCake() {
		name = "Vanilla Cake";
		dough = "Regular Crust";
		cream = "Vanilla Cream";
		toppings.add("Cherries");
	}

}

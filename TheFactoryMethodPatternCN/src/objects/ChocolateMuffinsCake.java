package objects;

import abstract_objects.Cake;

public class ChocolateMuffinsCake extends Cake {
	public ChocolateMuffinsCake() {
		name = "Chocolate Muffins Cake";
		dough = "Soft Dough";
		cream = "Chocolate Muffin Cream";

		toppings.add("Muffins");
	}

	public void decorate() {
		System.out.println("Adding the muffins");
	}
}

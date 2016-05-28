package objects;

import abstract_objects.Cake;

public class ChocolateFruitsCake extends Cake {
	public ChocolateFruitsCake() {
		name = "Chocolate Fruits Cake";
		dough = "Soft Dough";
		cream = "Chocolate Cream";

		toppings.add("Cherries");
		toppings.add("Bannanas");
		toppings.add("Strawberries");
	}

	public void decorate() {
		System.out.println("Adding the extra fruits");
	}

}

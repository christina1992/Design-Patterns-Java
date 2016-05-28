package objects;

import abstract_objects.Cake;

public class ChocolateVeganCake extends Cake {
	public ChocolateVeganCake() {
		name = "Chocolate Vegan Cake";
		dough = "Soft Dough";
		cream = "Frutty Cream";

		toppings.add("Bannanas");
		toppings.add("Strawberries");
	}

	public void decorate() {
		System.out.println("Adding the chocolate cream");
	}
}

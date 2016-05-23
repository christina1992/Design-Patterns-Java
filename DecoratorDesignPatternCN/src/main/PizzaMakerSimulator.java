package main;

public class PizzaMakerSimulator {

	public static void main(String[] args) {
		Pizza pizza = new VegeterianPizza();
		System.out.println(pizza.getDescription() + " " + pizza.cost() + " euros");

		Pizza pizza2 = new MargheritaPizza();
		pizza2 = new Olives(pizza2);
		pizza2 = new Mushrooms(pizza2);
		pizza2 = new Pepperoni(pizza2);
		pizza2 = new Cheese(pizza2);

		System.out.println(pizza2.getDescription() + " " + pizza2.cost() + " euros");

	}

}

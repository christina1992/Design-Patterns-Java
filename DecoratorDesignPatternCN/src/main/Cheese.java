package main;

public class Cheese extends IngredientDecorator {
	Pizza pizza;

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", + Extra Cheese";
	}

	@Override
	public double cost() {
		// in euro
		return 2 + pizza.cost();
	}

}

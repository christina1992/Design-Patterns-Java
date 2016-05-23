package main;

public class Olives extends IngredientDecorator {
	Pizza pizza;

	public Olives(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", + Olives";
	}

	@Override
	public double cost() {
		// euro
		return 1.8 + pizza.cost();
	}

}

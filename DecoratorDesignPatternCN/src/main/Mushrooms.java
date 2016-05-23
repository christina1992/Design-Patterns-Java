package main;

public class Mushrooms extends IngredientDecorator {
	Pizza pizza;

	public Mushrooms(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", + Mushrooms";
	}

	@Override
	public double cost() {
		// in euro
		return 1.2 + pizza.cost();
	}

}

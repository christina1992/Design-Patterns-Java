package main;

public class Pepperoni extends IngredientDecorator {
	Pizza pizza;

	public Pepperoni(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", + Pepperoni";
	}

	@Override
	public double cost() {
		// in euro
		return 3 + pizza.cost();
	}

}

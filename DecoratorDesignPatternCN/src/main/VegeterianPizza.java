package main;

public class VegeterianPizza extends Pizza {

	public VegeterianPizza() {
		description = "This is a Vegeterian Pizza";
	}

	@Override
	public double cost() {
		// in euro
		return 7;
	}

}

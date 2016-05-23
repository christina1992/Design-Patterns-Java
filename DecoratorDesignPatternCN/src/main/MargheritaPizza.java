package main;

public class MargheritaPizza extends Pizza {

	public MargheritaPizza() {
		description = "This is Margherita Pizza";
	}

	@Override
	public double cost() {
		// in euro
		return 4.8;
	}

}

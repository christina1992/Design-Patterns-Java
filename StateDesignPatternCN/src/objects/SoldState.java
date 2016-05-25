package objects;

import interfaces.State;

public class SoldState implements State {
	CoffeeMakerMachine coffee;

	public SoldState(CoffeeMakerMachine coffee) {
		this.coffee = coffee;
	}

	@Override
	public void insertMoney() {
		System.out.println("Please wait.. take your coffee first");

	}

	@Override
	public void ejectMoney() {
		System.out.println("Take your coffee first then order again");

	}

	@Override
	public void makeCoffee() {
		System.out.println("Can not make coffee..");

	}

	@Override
	public void deliverCoffee() {
		System.out.println("Take your coffee :)");
		coffee.setState(coffee.getNoMoneyState());
		coffee.done = true;

	}

	public String toString() {
		return "SoldStateObject";
	}

}

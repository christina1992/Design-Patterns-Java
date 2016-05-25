package objects;

import interfaces.State;

public class HasMoneyState implements State {
	CoffeeMakerMachine coffee;

	public HasMoneyState(CoffeeMakerMachine coffee) {
		this.coffee = coffee;
	}

	@Override
	public void insertMoney() {
		System.out.println("Wait your first coffee to be done, then insert some money again");

	}

	@Override
	public void ejectMoney() {
		System.out.println("Money returned");
		//coffee.setState(coffee.getNoMoneyState());

	}

	@Override
	public void makeCoffee() {
		System.out.println("Your coffee is being made...");
		coffee.setState(coffee.getSoldState());

	}

	@Override
	public void deliverCoffee() {
		System.out.println("can not deliver coffee");

	}

	public String toString() {
		return "HasMoneyStateObject";
	}
}

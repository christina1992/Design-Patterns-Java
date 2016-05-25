package objects;

import interfaces.State;

public class NoMoneyState implements State {
	CoffeeMakerMachine coffee;

	public NoMoneyState(CoffeeMakerMachine coffee) {
		this.coffee = coffee;
	}

	@Override
	public void insertMoney() {
		System.out.println("You have inserted some money");
		coffee.setState(coffee.getHasMoneyState());
	}

	@Override
	public void ejectMoney() {
		System.out.println("There are no money iserted");
	}

	@Override
	public void makeCoffee() {
		System.out.println("Coffee can not be made without money1");

	}

	@Override
	public void deliverCoffee() {
		System.out.println("You need to pay first1");

	}

	public String toString() {
		return "NoMoneyStateObject";
	}

}

package objects;

import interfaces.State;

public class SoldOutState implements State {
	CoffeeMakerMachine coffe;

	public SoldOutState(CoffeeMakerMachine coffe) {
		this.coffe = coffe;
	}

	@Override
	public void insertMoney() {
		System.out.println("You can't insert money, the machine is sold out");

	}

	@Override
	public void ejectMoney() {
		System.out.println("You can't eject, you haven't inserted money yet");

	}

	@Override
	public void makeCoffee() {
		System.out.println("The machine is empty");

	}

	@Override
	public void deliverCoffee() {
		System.out.println("Can not deliver coffee to you at this moment");

	}

	public String toString() {
		return "SoldOutStateObject";
	}

}

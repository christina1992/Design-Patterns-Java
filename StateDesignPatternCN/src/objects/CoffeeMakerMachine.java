package objects;

import interfaces.State;

public class CoffeeMakerMachine {
	State soldOutState;
	State noMoneyState;
	State hasMoneyState;
	State soldState;
	State state = soldOutState;
	boolean done = true;

	public CoffeeMakerMachine() {
		soldOutState = new SoldOutState(this);
		noMoneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		soldState = new SoldState(this);

		if (done) {
			done = false;
			state = noMoneyState;
		}
	}

	public void insertMoney() {
		state.insertMoney();
	}

	public void ejectMoney() {
		state.ejectMoney();
	}

	public void makingCoffee() {
		state.makeCoffee();
		state.deliverCoffee();
		state = noMoneyState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoMoneyState() {
		return noMoneyState;
	}

	public void setNoMoneyState(State noMoneyState) {
		this.noMoneyState = noMoneyState;
	}

	public State getHasMoneyState() {
		return hasMoneyState;
	}

	public void setHasMoneyState(State hasMoneyState) {
		this.hasMoneyState = hasMoneyState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nCoffe maker machine");
		result.append("\n");
		result.append("Machine is in " + state + "\n");
		return result.toString();
	}
}

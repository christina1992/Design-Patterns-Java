package objects;

import abstract_objects.Cake;

public class CakeStore {
	CakeFactory factory = new CakeFactory();

	public CakeStore(CakeFactory factory) {
		this.factory = factory;
	}

	public Cake orderPizza(String type) {
		Cake cake;

		cake = factory.createCake(type);

		cake.bake();
		cake.box();
		cake.decorate();
		return cake;
	}

}

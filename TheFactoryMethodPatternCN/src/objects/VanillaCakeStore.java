package objects;

import abstract_objects.Cake;
import abstract_objects.CakeStore;

public class VanillaCakeStore extends CakeStore {

	@Override
	public Cake createCake(String item) {
		if (item.equals("cheesecake")) {
			return new VanillaCheeseCake();
		} else if (item.equals("vegan")) {
			return new VanillaVeganCake();
		} else if (item.equals("fruits")) {
			return new VanillaFruitsCake();
		} else
			return null;
	}

}

package objects;

import abstract_objects.Cake;
import abstract_objects.CakeStore;

public class ChocolateCakeStore extends CakeStore {

	public Cake createCake(String item) {
		if (item.equals("muffin")) {
			return new ChocolateMuffinsCake();
		} else if (item.equals("vegan")) {
			return new ChocolateVeganCake();
		} else if (item.equals("fruits")) {
			return new ChocolateFruitsCake();
		} else
			return null;
	}
}

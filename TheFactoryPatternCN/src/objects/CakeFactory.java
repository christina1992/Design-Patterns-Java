package objects;

import abstract_objects.Cake;

public class CakeFactory {
	public Cake createCake(String type) {
		Cake cake = null;

		if (type.equals("vanilla")) {
			cake = new VanillaCake();
		} else if (type.equals("chocolate")) {
			cake = new ChocolateCake();
		}
		return cake;
	}
}

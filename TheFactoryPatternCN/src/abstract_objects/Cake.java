package abstract_objects;

import java.util.ArrayList;

public abstract class Cake {
	public String name;
	public String dough;
	public String cream;
	public ArrayList<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Making dough...");
		System.out.println("Adding cream...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("Bake for 45 minutes at 250");
	}

	public void decorate() {
		System.out.println("Decorate the cream");
	}

	public void box() {
		System.out.println("Place cake in a decorated box");
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(cream + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String) toppings.get(i) + "\n");
		}
		return display.toString();
	}
}

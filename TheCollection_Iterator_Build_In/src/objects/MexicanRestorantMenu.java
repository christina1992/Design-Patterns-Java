package objects;

import java.util.ArrayList;
import java.util.Iterator;

import interfaces.Menu;

public class MexicanRestorantMenu implements Menu {
	ArrayList<String> menuItems;

	public MexicanRestorantMenu() {
		menuItems = new ArrayList<String>();

		addItem("Taco");
		addItem("Burrito");
		addItem("Chilli Chicken Fingers");
	}

	public void addItem(String name) {
		menuItems.add(name);
	}

	public ArrayList<String> getMenuItems() {
		return menuItems;
	}

	public String toString() {
		return "Mexican Menu";
	}

	@Override
	public Iterator<String> createIterator() {
		return menuItems.iterator();
	}

}

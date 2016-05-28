package objects;

import java.util.Iterator;

import interfaces.Menu;

public class ItalianRestorantMenu implements Menu {
	static final int MAX_ITEMS = 3; // for testing purposes
	int numberOfItems = 0;
	String[] menuItems;

	public ItalianRestorantMenu() {
		menuItems = new String[MAX_ITEMS];

		addItem("Vegetarian sos pasta");
		addItem("Extra cheese pasta");
		addItem("Italian pizza");
	}

	public void addItem(String name) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = name;
			numberOfItems = numberOfItems + 1;
		}
	}

	public String[] getMenuItems() {
		return menuItems;
	}

	public String toString() {
		return "Italian Menu";
	}

	@Override
	public Iterator<String> createIterator() {
		return new ItalianRestorantIterator(menuItems);
	}

}

package main;

import java.util.Iterator;

import objects.ItalianRestorantMenu;
import objects.MexicanRestorantMenu;

public class MenuRestorantSimulator {

	public static void main(String[] args) {
		ItalianRestorantMenu italianMenu = new ItalianRestorantMenu();
		MexicanRestorantMenu mexicanMenu = new MexicanRestorantMenu();
		// with iterators
		Iterator<String> italianIterator = italianMenu.createIterator();
		Iterator<String> mexicanIterator = mexicanMenu.createIterator();
		printMenu(italianIterator);
		printMenu(mexicanIterator);
	}

	private static void printMenu(Iterator<String> iterator) {
		while (iterator.hasNext()) {
			String menuItem = (String) iterator.next();
			System.out.println(menuItem);

		}
	}
}

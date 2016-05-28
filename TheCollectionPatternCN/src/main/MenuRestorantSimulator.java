package main;

import java.util.ArrayList;

import interfaces.Iterator;
import objects.ItalianRestorantMenu;
import objects.MexicanRestorantMenu;

public class MenuRestorantSimulator {

	public static void main(String[] args) {
		ItalianRestorantMenu italianMenu = new ItalianRestorantMenu();
		MexicanRestorantMenu mexicanMenu = new MexicanRestorantMenu();
		ArrayList<String> breakfastItems = mexicanMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			String menuItem = (String) breakfastItems.get(i);
			//System.out.println(menuItem);
		}

		String[] lunchItems = italianMenu.getMenuItems();

		for (int i = 0; i < lunchItems.length; i++) {
			String menuItem = lunchItems[i];
			//System.out.println(menuItem);
		}

		// with iterators
		Iterator mexicanIterator = mexicanMenu.iterator();
		Iterator italianIterator = italianMenu.iterator();

		printMenu(italianIterator);
		System.out.println("\n");
		printMenu(mexicanIterator);
	}

	private static void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			String menuItem = (String) iterator.next();
			System.out.println(menuItem);

		}
	}
}

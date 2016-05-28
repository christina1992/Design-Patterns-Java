package objects;

import java.util.ArrayList;

import interfaces.Iterator;

public class MexicanRestorantIterator implements Iterator {
	ArrayList<String> items;
	int position = 0;

	public MexicanRestorantIterator(ArrayList<String> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	public String next() {
		String menuItem = (String) items.get(position);
		position = position + 1;
		return menuItem;
	}

}

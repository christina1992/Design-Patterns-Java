package objects;

import java.util.Iterator;

public class ItalianRestorantIterator implements Iterator<String> {
	String[] items;
	int position = 0;

	public ItalianRestorantIterator(String[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public String next() {
		String menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

}

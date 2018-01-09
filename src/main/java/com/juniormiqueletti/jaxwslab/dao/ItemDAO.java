package com.juniormiqueletti.jaxwslab.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.juniormiqueletti.jaxwslab.domain.Filter;
import com.juniormiqueletti.jaxwslab.domain.Item;

public class ItemDAO {

	private static Map<String, Item> ITEMS = new HashMap<>();

	public ItemDAO() {
		ITEMS.put("MEA", new Item("MEA", "MEAN", "Book", 5));
		ITEMS.put("SEO", new Item("SEO", "SEO", "Book", 4));
		ITEMS.put("IP4", new Item("IP4", "IPhone 4 C", "Smartphone", 7));
		ITEMS.put("GAL", new Item("GAL", "Galaxy Tab", "Tablet", 3));
		ITEMS.put("MOX", new Item("MOX", "Moto X", "SmartPhone", 6));
	}

	public List<Item> findAll() {
		return new ArrayList<Item>(ITEMS.values());
	}

	public ArrayList<Item> allItems(List<Filter> filterList) {
		ArrayList<Item> result = new ArrayList<Item>();
		Collection<Item> allItems = ITEMS.values();

		if (filterList == null || filterList.isEmpty()) {
			result.addAll(allItems);
			return result;
		}

		for (Filter filter : filterList) {
			for (Item item : allItems) {

				String type = filter.getType().getName();
				String name = filter.getName();

				if (itemWithType(item, type) && itemWithName(item, name)) {
					result.add(item);
				}
			}
		}

		return result;
	}

	private boolean itemWithType(Item item, String type) {
		return item.getType().equals(type);
	}

	private boolean itemWithName(Item item, String name) {
		return item.getName().contains(name);
	}
}

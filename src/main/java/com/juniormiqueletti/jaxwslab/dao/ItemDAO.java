package com.juniormiqueletti.jaxwslab.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.juniormiqueletti.jaxwslab.domain.Item;

public class ItemDAO {
	
	 private static Map<String, Item> ITENS = new HashMap<>();

	    public ItemDAO() {
	        ITENS.put("MEA", new Item("MEA", "MEAN", "Book", 5));
	        ITENS.put("SEO", new Item("SEO", "SEO", "Book", 4));
	        ITENS.put("IP4", new Item("IP4", "IPhone 4 C", "SmartPhone", 7));
	        ITENS.put("GAL", new Item("GAL", "Galaxy Tab", "Tablet", 3));
	        ITENS.put("MOX", new Item("MOX", "Moto X", "SmartPhone" , 6));
	    }

		public List<Item> findAll() {
			return new ArrayList<Item>(ITENS.values());
		}
	    
	    
}

package com.juniormiqueletti.jaxwslab.service;

import java.util.ArrayList;
import java.util.List;

import com.juniormiqueletti.jaxwslab.domain.Item;
import com.juniormiqueletti.jaxwslab.domain.ItemType;
import com.juniormiqueletti.jaxwslab.exception.ItemValidatorException;

public class ItemValidatorServiceImpl implements ItemValidatorService{

	private Item item;

	public ItemValidatorServiceImpl(Item item) {
		this.item = item;
	}

	public void validate() {
		List<String> errors = new ArrayList<>();

		String code = item.getCode();
		if (isEmpty(code) || code.length() != 3) {
			errors.add("Invalid code");
		}

		String name = item.getName();
		if (isEmpty(name) || name.length() < 3) {
			errors.add("invalid name");
		}

		int quantity = item.getQuantity();
		if (quantity <= 0) {
			errors.add("Invalid quantity");
		}

		String type = item.getType();
		if (isEmpty(type) || !ItemType.exist(type)) {
			errors.add("Invalid type");
		}

		if (!errors.isEmpty()) {
			throw new ItemValidatorException(errors);
		}
	}

	private boolean isEmpty(String valor) {
		return valor == null || valor.isEmpty();
	}

}

package com.juniormiqueletti.jaxwslab.domain;

import javax.xml.bind.annotation.XmlEnumValue;

public enum ItemType {

	@XmlEnumValue("Book")
	BOOK("Book"), @XmlEnumValue("Smartphone")
	SMARTPHONE("Smartphone"), @XmlEnumValue("Tablet")
	TABLET("Tablet");

	private String name;

	ItemType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static boolean exist(String value) {
		try {
			ItemType.valueOf(value.toUpperCase());
		} catch (IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}

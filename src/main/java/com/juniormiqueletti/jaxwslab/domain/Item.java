package com.juniormiqueletti.jaxwslab.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Item {
	
	@XmlElement(required=true)
	private String code;
	@XmlElement(required=true)
	private String name;
	@XmlElement(required=true)
	private String type;
	@XmlElement(required=true)
	private int quantity;

	public Item() {
	}

	public Item(String code, String name, String type, int quantity) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

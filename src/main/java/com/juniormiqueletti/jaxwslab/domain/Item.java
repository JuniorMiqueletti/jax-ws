package com.juniormiqueletti.jaxwslab.domain;

public class Item {

	private String codigo;
	private String name;
	private String type;
	private int quantity;

	public Item(String codigo, String name, String type, int quantity) {
		this.codigo = codigo;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

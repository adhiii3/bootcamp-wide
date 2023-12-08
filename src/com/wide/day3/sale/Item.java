package com.wide.day3.sale;

public class Item {
	private String itemCode;
	private int price;
	private String description;
	private String type;
	
	public Item(String itemCode, int price, String description, String type) {
		this.itemCode = itemCode;
		this.price = price;
		this.description = description;
		this.type = type;
	}
	public String getItemCode() {
		return itemCode;
	}
	public int getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public String getType() {
		return type;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

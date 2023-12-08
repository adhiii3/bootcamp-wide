package com.wide.day3.sale;

public class SaleItem {
	
	private int quantity;
	private Item item;
	
	
	public SaleItem(int quantity, Item item) {
		this.quantity = quantity;
		this.item = item;
	}
	
	public int getTotalPrice() {
		return this.item.getPrice() * this.getQuantity();
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public Item getItem() {
		return new Item(this.item.getItemCode(),
				this.item.getPrice(),
				this.item.getDescription(),
				this.item.getType());
	}
}

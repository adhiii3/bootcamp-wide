package com.wide.day3.sale;

import java.time.LocalDate;
import java.util.Arrays;

public class Sale {
	private String salesNumber;
	private LocalDate transDate;
	private Cashier cashier;
	private SaleItem[] saleItem = new SaleItem[3];	
	
	public Sale(String salesNumber, Cashier cashier, LocalDate transDate) {
		super();
		this.salesNumber = salesNumber;
		this.transDate = transDate;
		this.cashier = cashier;
	}

	public void addSaleItem(SaleItem saleItem) {
		for(int i = 0; i < this.saleItem.length; i++) {
			if(this.saleItem[i] == null) {
				this.saleItem[i] = saleItem;
				break;
			}
		}
	}
	
	public SaleItem[] getSaleItem() {
		return Arrays.copyOf(this.saleItem, this.saleItem.length);
	}
	
	public int getTotalPrice() {
		int result = 0;
		for(int i = 0; i < this.saleItem.length; i++) {
			if(this.saleItem[i] != null) {
				result += this.saleItem[i].getTotalPrice();
			}
		}
		return result;
	}

	public String getSalesNumber() {
		return salesNumber;
	}

	public LocalDate getTransDate() {
		return transDate;
	}
	
	public Cashier getCashier() {
		return new Cashier(
				this.cashier.getNip(),
				this.cashier.getName());
	}
}

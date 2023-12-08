package com.wide.day3.sale;

import java.time.LocalDate;

public class TestSale {
	public static void main(String[] args) {
		
		Cashier ira = new Cashier("C-123","Ira");
		
		Item shampo = new Item("ITEM-111",5_000,"Pembersih Rambut","Pembersih");
		Item indomie = new Item("ITEM-222",3_000,"Mie Instant","Makanan");
		Item lemari = new Item("ITEM-333",15_000,"Penyimpanan Pakaian","Pembersih");
		
		
		SaleItem saleItem1 = new SaleItem(2, shampo);
		SaleItem saleItem2 = new SaleItem(5, indomie);
		SaleItem saleItem3 = new SaleItem(1, lemari);
		
		
		LocalDate transDate = LocalDate.now();
		Sale sale1 = new Sale("SALE-1", ira, transDate);
		
		sale1.addSaleItem(saleItem1);
		sale1.addSaleItem(saleItem2);
		sale1.addSaleItem(saleItem3);
		
		printSale(sale1);
	}
	
	public static void printSale(Sale sale1) {
		System.out.println(
				"Sale Number : "+" "+sale1.getSalesNumber() + "  " +
				"Name : "+sale1.getCashier().getName() + "  " +
				"Date : "+ sale1.getTransDate());
				
				System.out.println("Item Code " + " " + " Description " + " Type " + " Price " + 
				"Quantity" + " Total Price");
		
		for(SaleItem saleItem : sale1.getSaleItem()) {
			if(saleItem != null) {
				Item item = saleItem.getItem();
				System.out.println(
					item.getItemCode()+ " " +
					item.getDescription()+ " "+
					item.getType()+ " "+
					item.getPrice()+ " "+
					saleItem.getQuantity()+ " " +
					saleItem.getTotalPrice());
			}
		}
		
		System.out.println("Jumlah Yang Harus Dibayar : "+ sale1.getTotalPrice());
	}
}

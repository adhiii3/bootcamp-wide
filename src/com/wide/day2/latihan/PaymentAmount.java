package com.wide.day2.latihan;

public class PaymentAmount {
	
	private String id;
	
	private Product product;
	
	private double pembayaran;
	
	private double totalHarga;
	
	private double cashReturn;
	
	private int quantity;
	
	public PaymentAmount(Product product,int quantity,int uangPembayaran) {
		this.product = product;
		this.quantity = quantity;
		this.pembayaran = uangPembayaran;
	}

	
	public Product getProduct() {
		return product;
	}

	public double getPembayaran() {
		return pembayaran;
	}

	public double getTotalHarga() {
		return product.getPrice() * quantity;
	}
	
	public double getCashReturn() {
		return getPembayaran() - getTotalHarga();
	}
	
}

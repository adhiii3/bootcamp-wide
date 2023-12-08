package com.wide.day2.latihan;

public class ViewPayment {
	
	private Cashier cashier;
	
	private PaymentAmount paymentAmount;

	public ViewPayment(Cashier cashier, PaymentAmount paymentAmount) {
		super();
		this.cashier = cashier;
		this.paymentAmount = paymentAmount;
	}

	public void showListPayment() {
		System.out.println("ViewPayment [cashier=" + cashier.getName() 
				+ " uang pembayaran=" + paymentAmount.getPembayaran()
				+ " total Harga=" + paymentAmount.getTotalHarga()
				+ " cash return=" + paymentAmount.getCashReturn()
				+
				"]");
	}
	
	
	
	
}

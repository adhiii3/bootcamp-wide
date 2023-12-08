package com.wide.day2.latihan;

public class TestSale {
	public static void main(String[] args) {
		
		String idCashier = "123";
		String namaCashier = "Ira";
		Cashier ira = new Cashier(idCashier,namaCashier);
		
		
		double hargaLaptop = 2_000_000;
		String namaLaptop = "Asus";
		String idLaptop = "123";
		Product laptop = new Product(idLaptop,namaLaptop, hargaLaptop);

		
		int quantity = 2;
		int uangPembayaran = 4_100_000;
		PaymentAmount payment = new PaymentAmount(laptop,quantity,uangPembayaran);
		
		ViewPayment view = new ViewPayment(ira, payment);
		
		view.showListPayment();
	}
}

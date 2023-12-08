package com.wide.day2.latihan;

public class Cashier {
	
	private String nip;
	private String name;
	
	
	
	public Cashier(String nip, String name) {
		super();
		this.nip = nip;
		this.name = name;
	}
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

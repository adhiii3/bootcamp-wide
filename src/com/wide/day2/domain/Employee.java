package com.wide.day2.domain;

public class Employee {
	private String nip;
	private String name;
	private int age;
	private String address;
	private double salary;
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void checkIn() {
		System.out.println("Check in ...");
	}
	
	public void checkOut() {
		System.out.println("Check out ...");
	}
	
	public double getSalary() {
		return 1000000.0;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

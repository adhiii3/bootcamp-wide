package com.wide.day2.test;

import com.wide.day2.domain.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setNip("3213");
		
		emp1.setName("Adhi");
		emp1.setAge(21);
		emp1.setAddress("Depok");
		emp1.setSalary(1_000_000);
		
		emp1.checkIn();
		emp1.checkOut();
		System.out.println(emp1.getSalary());
	}
	
}

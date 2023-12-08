package com.wide.day1;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i=1; i <= 1000; i++) {
			if(i % 2 == 0) {
				result = result + i;
			}
		}
		System.out.print(result);
	}

}

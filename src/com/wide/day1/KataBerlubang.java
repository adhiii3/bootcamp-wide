package com.wide.day1;

import java.util.Scanner;

public class KataBerlubang {
	
	public static void main(String[] args) {
	    
	    char[] karakterSatuLubang = {'4','6','9','0','q','Q','e','R','o','O','P','p','a','A','d','D','g','b'};
	    char[] karakterDuaLubang = {'B','8'};
	    
	    Scanner sc = new Scanner(System.in);
	    String teks = sc.next();
	    
	    int result = 0;
	    char[] charText = teks.toCharArray();
	    
	    for(char c : charText) {
	    	for(char k : karakterSatuLubang) {
	    		if(c == k) {
	    			result++;
	    		}
	    	}
	    }
	    
	    for(char c : charText) {
	    	for(char k : karakterDuaLubang) {
	    		if(c == k ) {
		    		result += 2;
		    	}
	    	}
	    }
	    
	    System.out.print(result);
	    
	}
	
}

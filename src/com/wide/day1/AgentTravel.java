package com.wide.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgentTravel {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jumlahPenumpang = sc.nextInt();
		int tidakAdaPenumpang = 0;
		int maksimalPenumpang = 120;
		int[] kursiBus = {12,18,32,45,60};
		int[] hargaBus = {1_300_000,1_500_000,1_800_000,2_000_000,2_300_000};
		int hargaBusYangDirekomendasikan = 0;

		if(tidakAdaPenumpang < jumlahPenumpang && jumlahPenumpang <= maksimalPenumpang) {
			for(int i = 0; i < kursiBus.length; i++) {
				if(kursiBus[i] >= jumlahPenumpang) {
					hargaBusYangDirekomendasikan= hargaBus[i];
					break;
				}

				if(jumlahPenumpang > kursiBus[kursiBus.length - 1]) {
					hargaBusYangDirekomendasikan= hargaBus[hargaBus.length - 1] * 2;
					break;
				}
			}
		}
			
		System.out.println(hargaBusYangDirekomendasikan);
		
	}
}

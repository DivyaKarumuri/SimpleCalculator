package com.division;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the how many numbers you want to divide");
		int n = scan.nextInt();
		int res = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the "+(i+1)+" value for division");
			int val = scan.nextInt();
			
			res = res / val;
		}
		System.out.println("The resultant value is "+res);


	}

}

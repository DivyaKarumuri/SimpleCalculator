package com.multiplication;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the how many numbers you want to multiply");
		int n = scan.nextInt();
		int res = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the "+(i+1)+" value for multiplication");
			int val = scan.nextInt();
			
			res = res * val;
		}
		System.out.println("The resultant value is "+res);

	}

}

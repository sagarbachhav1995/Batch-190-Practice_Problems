package com.blz.basiccore.programe;

import java.util.Scanner;

public class Number_EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Please Enter The Number:");
		int number = num.nextInt();
		if (number % 2 == 0) {
		System.out.println("The No. is Even");
		}
		else {
		System.out.println("The No. is Odd");
		}
	}

}

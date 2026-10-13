package com.tka;

public class FindGreaterNumber {
	public static void main(String[] args) {
		int num1 = 76;
		int num2 = 75;

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is greater than " + num1);
		} else {
			System.out.println("Both numbers are equal: " + num1);
		}
	}
}

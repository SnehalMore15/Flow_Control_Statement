package com.tka;

public class CheckNumberPosNegOrZero {
	public static void main(String[] args) {
		int num = 77;
		if (num < 0) {
			System.out.println(num + " is negative");
		} else if (num > 0) {
			System.out.println(num + " is positive");

		} else {
			System.out.println(num + " is zero");

		}
	}

}

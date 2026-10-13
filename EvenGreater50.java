package com.tka;

public class EvenGreater50 {
	public static void main(String[] args) {
		int num = 60;
		if (num % 2 == 0) {
			System.out.println("Even");
			if (num > 50)
				System.out.println("Greater than 50");
			else
				System.out.println("Not greater than 50");
		} else {
			System.out.println("Odd");
		}
	}
}

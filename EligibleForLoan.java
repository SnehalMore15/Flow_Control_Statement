package com.tka;

public class EligibleForLoan {
	public static void main(String[] args) {
		int age = 34;
		int salary = 45000;

		if (age >= 21 && salary >= 25000) {
			System.out.println("person is eligible for loan");
		} else {
			System.out.println("person is not eligible for loan");
		}
	}

}

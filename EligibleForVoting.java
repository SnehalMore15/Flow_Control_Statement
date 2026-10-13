package com.tka;

public class EligibleForVoting {
	public static void main(String[] args) {

		int age = 34;
		if (age >= 18 && age <= 120) {
			System.out.println(age +" age is Eligible for voting");

		}else
			System.out.println(age +" age is not Eligible for voting");

	}
}

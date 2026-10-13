package com.tka;

public class VoteContest {
	public static void main(String[] args) {
		int age = 26;
		if (age >= 18) {
			System.out.println("Eligible to Vote");
			if (age >= 25) {
				System.out.println("Can Contest in Elections");
			} else {
				System.out.println("Cannot Contest - Age < 25");
			}
		} else {
			System.out.println("Not Eligible to Vote");
		}
	}

}

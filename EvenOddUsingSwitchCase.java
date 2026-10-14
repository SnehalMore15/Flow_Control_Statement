package com.tka;

public class EvenOddUsingSwitchCase {
	public static void main(String[] args) {
		int num = 5;
		switch (num % 2) {
		case 0:
			System.out.println("even --> "+ num);
			break;
		default:
			System.out.println("Odd --> "+ num);

		}

	}

}

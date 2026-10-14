package com.tka;

public class WeekType {
	public static void main(String[] args) {
		int num = 4;
		switch (num) {
		case 1, 2, 3, 4, 5:
			System.out.println("Weekday");
			break;
		case 6, 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("invalid day number");

		}
	}

}

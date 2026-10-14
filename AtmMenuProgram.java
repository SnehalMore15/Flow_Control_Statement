package com.tka;

public class AtmMenuProgram {

	public static void main(String[] args) {
		int choice = 4;

		switch (choice) {
		case 1:
			System.out.println("1 -> Check Balance");
			break;
		case 2:
			System.out.println("2 -> Withdraw");
			break;
		case 3:
			System.out.println("3 -> Deposit");
			break;
		case 4:
			System.out.println("4 -> Exit");
			break;
		default:
			System.out.println("Invalid Option");
		}
	}
}

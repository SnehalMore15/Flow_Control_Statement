package com.tka;

public class MenuDriven {

	public static void main(String[] args) {
		int num = 2;

		switch (num) {
		case 1:
			System.out.println("1 -> Login");
			break;
		case 2:
			System.out.println("2 -> Register");
			break;
		case 3:
			System.out.println("3 -> Profile");
			break;
		case 4:
			System.out.println("4 -> Logout");
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}

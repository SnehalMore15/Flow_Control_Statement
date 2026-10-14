package com.tka;

public class MobileMenu {

	public static void main(String[] args) {
		int categoryNo = 2;

		switch (categoryNo) {
		case 1:
			System.out.println("1 -> WiFi");
			break;
		case 2:
			System.out.println("2 -> Bluetooth");
			break;
		case 3:
			System.out.println("3 -> Mobile Data");
			break;
		case 4:
			System.out.println("4 -> Airplane Mode");
			break;
		default:
			System.out.println("Invalid categoryNo");
		}
	}
}

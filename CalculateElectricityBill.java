package com.tka;

public class CalculateElectricityBill {

	public static void main(String[] args) {
		int units = 250;
		int bill = 0;
		if (units <= 100) {
			bill = units * 5;
		} else if (units <= 200) {
			bill = units * 7;
		} else {
			bill = units * 10;
		}

		System.out.println("Units: " + units);
		System.out.println("Total Bill: Rs." + bill);
	}
}

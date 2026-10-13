package com.tka;

public class OnlineShoppingDiscount {
	public static void main(String[] args) {
		int amount = 1200;
		String membership = "yes"; 

		if (amount > 1000) {
			if (membership.equals("yes")) {
				System.out.println("Amount: " + amount + " -> 20% Discount");
				System.out.println("Payable: " + (amount - amount * 0.20));
			} else {
				System.out.println("Amount: " + amount + " -> 10% Discount");
				System.out.println("Payable: " + (amount - amount * 0.10));
			}
		} else {
			System.out.println("Amount: " + amount + " -> No Discount");
		}
	}
}

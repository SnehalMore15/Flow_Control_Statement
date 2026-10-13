package com.tka;

public class ATMWithdrawal {
	public static void main(String[] args) {
		int balance = 5000;
		int withdrawalAmount = 2000;

		if (balance >= withdrawalAmount) {
			if (withdrawalAmount % 100 == 0) {
				balance = balance - withdrawalAmount;
				System.out.println("Withdrawal successful. Remaining balance: " + balance);
			} else {
				System.out.println("Invalid denomination. Amount must be multiple of 100");
			}
		} else {
			System.out.println("Insufficient balance");
		}
	}
}

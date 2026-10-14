package com.tka;

public class PrintResultstatus {

	public static void main(String[] args) {
		int marks = 3;

		switch (marks) {
		case 1:
			System.out.println("1 -> Pass");
			break;
		case 2:
			System.out.println("2 -> Distinction");
			break;
		case 3:
			System.out.println("3 -> Fail");
			break;
		default:
			System.out.println("Invalid Category");
		}
	}
}

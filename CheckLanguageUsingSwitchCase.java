package com.tka;

public class CheckLanguageUsingSwitchCase {
	public static void main(String[] args) {
		int code = 4;

		switch (code) {
		case 1:
			System.out.println("1 -> Java");
			break;
		case 2:
			System.out.println("2 -> Python");
			break;
		case 3:
			System.out.println("3 -> C++");
			break;
		case 4:
			System.out.println("4 -> JavaScript");
			break;
		default:
			System.out.println("Invalid Code");
		}
	}
}

package com.tka;

public class VowelConsonent {
	public static void main(String[] args) {
		char alpha = 'd';
		switch (alpha) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Consonent");

		}
	}

}

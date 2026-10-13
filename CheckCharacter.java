package com.tka;

public class CheckCharacter {
	public static void main(String[] args) {
		char ch = 'a';
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println(ch + " is Vowel");
			} else {
				System.out.println(ch + " is Consonant");
			}
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is Digit");
		} else {
			System.out.println(ch + " is Special Character");
		}
	}
}
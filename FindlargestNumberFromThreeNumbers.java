package com.tka;

public class FindlargestNumberFromThreeNumbers {
	public static void main(String[] args) {
		int num1 = 45;
		int num2 = 55;
		int num3 = 65;
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater than " + num2 + " and " + num3);

		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greater than " + num1 + " and " + num3);

		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is greater than " + num1 + " and " + num2);
		} else {
			System.out.println("enter diffrent numbers");
		}
	}

}

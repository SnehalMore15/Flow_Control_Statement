package com.tka;

public class CalculationUsingSwitchCase {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		char operator = '+';
		switch (operator) {
		case '+':
			System.out.println("Addition = " + (num1 + num2));
			break;
		case '-':
			System.out.println("Substraction = " + (num1 + num2));

			break;
		case '*':
			System.out.println("Multiplication = " + (num1 + num2));
			break;
		case '/':
			System.out.println("division = " + (num1 + num2));
			break;

		}

	}

}

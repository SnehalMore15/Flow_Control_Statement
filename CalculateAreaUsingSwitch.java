package com.tka;

public class CalculateAreaUsingSwitch {
	public static void main(String[] args) {

		int choice = 1;
		switch (choice) {
		case 1:
			int radius = 5;
			double circleArea = 3.14 * radius * radius;
			System.out.println("Circle Area = " + circleArea);
			break;
		case 2:
			int length = 10;
			int breadth = 5;
			int rectArea = length * breadth;
			System.out.println("Rectangle Area = " + rectArea);
			break;
		case 3:
			int side = 4;
			int squareArea = side * side;
			System.out.println("Square Area = " + squareArea);
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}

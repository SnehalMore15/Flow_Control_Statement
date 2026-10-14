package com.tka;

public class FoodMenuProgram {

	public static void main(String[] args) {
		int FoodNo = 1;
		switch (FoodNo) {
		case 1:
			System.out.println("1 -> Pizza");
			break;
		case 2:
			System.out.println("2 -> Burger");
			break;
		case 3:
			System.out.println("3 -> Sandwich");
			break;
		case 4:
			System.out.println("4 -> Pasta");
			break;
		default:
			System.out.println("Invalid FoodNo");
		}
	}
}

package com.tka;

public class CheckTrangleType {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 5;
		if (x == y && y == z) {
			System.out.println("Equileteral");
		} else if (x == y || y == z || x == z) {
			System.out.println("Isosceles");

		} else {
			System.out.println("scalene");

		}

	}

}

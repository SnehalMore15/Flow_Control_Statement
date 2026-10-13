package com.tka;

public class ClassifyTemp {
	public static void main(String[] args) {

		float temp = 56.55f;
		if (temp >= 30) {
			System.out.println(temp + " is hot temprature");

		} else if (temp >= 20) {
			System.out.println(temp + " is warm temprature");

		} else if (temp >= 10) {
			System.out.println(temp + " is cool temprature");

		} else {
			System.out.println(temp + " is cold temprature");

		}

	}
}
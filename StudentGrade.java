package com.tka;

public class StudentGrade {
	public static void main(String[] args) {
		int marks = 82;

		if (marks < 40) {
			System.out.println("Fail");
		} else if (marks >= 90) {
			System.out.println("Pass - Grade A");
		} else if (marks >= 75) {
			System.out.println("Pass - Grade B");
		} else {
			System.out.println("Pass - Grade C");
		}
	}
}

package com.tka;

public class GradeBasedOnMarks {
	public static void main(String[] args) {
		double marks = 88.34;

		if (marks >= 75) {
			System.out.println("Distinction - Marks: " + marks);
		} else if (marks >= 60) {
			System.out.println("First Class - Marks: " + marks);
		} else if (marks >= 50) {
			System.out.println("Second Class - Marks: " + marks);
		} else if (marks >= 35) {
			System.out.println("Pass - Marks: " + marks);
		} else {
			System.out.println("Fail - Marks: " + marks);
		}
	}

}

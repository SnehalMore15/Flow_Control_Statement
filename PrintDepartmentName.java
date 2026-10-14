package com.tka;

public class PrintDepartmentName {

	public static void main(String[] args) {
		int dept = 1; // 1->CS, 2->Mech, 3->Civil, 4->Electrical

		switch (dept) {
		case 1:
			System.out.println("1 -> Computer Science");
			break;
		case 2:
			System.out.println("2 -> Mechanical");
			break;
		case 3:
			System.out.println("3 -> Civil");
			break;
		case 4:
			System.out.println("4 -> Electrical");
			break;
		default:
			System.out.println("Invalid Department");
		}
	}
}

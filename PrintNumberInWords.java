package com.tka;

public class PrintNumberInWords {
	
		public static void main(String[] args) {
			int num = 3; 
			switch(num) {
				case 1:
					System.out.println("1 -> One");
					break;
				case 2:
					System.out.println("2 -> Two");
					break;
				case 3:
					System.out.println("3 -> Three");
					break;
				case 4:
					System.out.println("4 -> Four");
					break;
				case 5:
					System.out.println("5 -> Five");
					break;
				default:
					System.out.println("Invalid Number");
			}
		}
	}


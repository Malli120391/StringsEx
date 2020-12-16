package com.javacodes.strings;

import java.util.Scanner;

public class StringToUpperCase {
	

	public static void main(String[] args) {

		String str = "java codes";

		String strUpperCase = str.toUpperCase();

		System.out.println("Java String to Upper Case: " + strUpperCase);

		readUserInputAndPrintInUpperCase();
	}

	private static void readUserInputAndPrintInUpperCase() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write input String and press Enter:");
		String str = sc.nextLine();
		System.out.println("Input String in Upper Case = " + str.toUpperCase());
		sc.close();
		
	}

}

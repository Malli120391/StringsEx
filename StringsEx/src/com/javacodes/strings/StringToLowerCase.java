package com.javacodes.strings;

import java.util.Scanner;

public class StringToLowerCase {

	public static void main(String[] args) {

		String str = "JAVACODES";

		String strLowerCase = str.toLowerCase();

		System.out.println("Java String to Lower Case Example Output: " + strLowerCase);

	    UserInputAndPrintInLowerCase();
	}

	private static void UserInputAndPrintInLowerCase() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide input String and press Enter:");
		String str = sc.nextLine();
		System.out.println("Input String in Lower Case = " + str.toLowerCase());
		sc.close();
		
	}

}

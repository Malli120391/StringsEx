package com.javacodes.strings;

import java.util.Scanner;

public class RemoveVowelsInString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string...");
         
        String inputString = sc.nextLine();
         
        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");
         
        System.out.println("The string without vowels...");
         
        System.out.println(newInputString);
         
        sc.close();

		/*
		 * String str = "Malleswararao chennu"; System.out.println("Given string: " +
		 * str); str = str.replaceAll("[AaEeIiOoUu]", "");
		 * System.out.println("After deleting vowels in given a string: " + str);
		 */
	}

}

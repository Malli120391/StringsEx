package com.javacodes.strings;

public class ABCDreverseOrder {

	public static void main(String[] args) {

		String str = "ABCD";
		for(int i=0; i<str.length();i++) {
			System.out.print((char)(str.charAt(i)+1));
		}
		
	}
}

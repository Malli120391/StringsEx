package com.javacodes.strings;

public class VowelsRemove {

	public static void main(String[] args) {

		 String str = "Hello Good Morning";
		    String s1 = str.replaceAll("[AEIOUaeiou]" , "");

		    System.out.println(s1);
	}

}

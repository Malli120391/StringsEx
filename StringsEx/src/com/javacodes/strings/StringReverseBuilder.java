package com.javacodes.strings;

public class StringReverseBuilder {

	public static void main(String[] args) {

		String str = "Java Codes";
	    System.out.println(reversewithStringBuilder(str));
	    System.out.println(reverseManually(str));
	}
	private static String reverseManually(String str){
		return new StringBuilder(str)
		.reverse()
		.toString();
	}
	
	private static String reversewithStringBuilder(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i >= 0; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	
	
	}

}

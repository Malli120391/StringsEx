package com.javacodes.strings;

public class FindLast2WordINString {

	public static void main(String[] args) {

		String str = "Java Codes for Learning gain";
		//String[] s=str.split("");
		//String Last2words = s[s.length-2];
		str = str.trim();
		String lastWord = str.substring(str.lastIndexOf(' ') + 1);
		System.out.println(lastWord);
	}

}

package com.javacodes.strings;

public class RemoveBlankSpaceToString {

	public static void main(String[] args) {

		String sentence = "JA VA  CO DE S.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }

	

}

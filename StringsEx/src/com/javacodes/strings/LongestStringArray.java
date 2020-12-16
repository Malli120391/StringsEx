package com.javacodes.strings;

public class LongestStringArray {
	
	public static String getLongestString(String[] array) {
	      int maxLength = 0;
	      String longestString = null;
	      for (String s : array) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }

	public static void main(String[] args) {

		String[] toppings = {"spring", "hibernate", "Jpa"};
	      String longestString = getLongestString(toppings);
	      System.out.format("longest string: '%s'\n", longestString);
	}

}

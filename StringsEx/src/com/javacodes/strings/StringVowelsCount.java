package com.javacodes.strings;

import java.util.Scanner;

public class StringVowelsCount {

	public static void main(String[] args) {
		
		int count = 0;
	      System.out.println("Enter a sentence :");
	      Scanner scan = new Scanner(System.in);
	      String sentence = scan.nextLine();

	      for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given sentence is "+count);
      
	      scan.close();
	      
	      
	      
	      
		/*
		 * String str1, str2; Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.print("Enter a String : "); str1 = scan.nextLine();
		 * 
		 * str2 = str1.replaceAll("[aeiouAEIOU]", "");
		 * 
		 * System.out.print("All Vowels Removed Successfully..!!\nNew String is : ");
		 * 
		 * System.out.print(str2); scan.close();
		 */
	   }
	}



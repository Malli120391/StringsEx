package com.javacodes.strings;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		
	}
	
	public int reverse(int input){
 	   
 	   long reversed = 0;
 	   while(input != 0){
 		   reversed = reversed * 10 + input % 10;
 		   input /= 10;
 		   
 		   if(reversed >  Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
 			   
 		   }
 		   
 	   }
		return 0;
			
		}

}


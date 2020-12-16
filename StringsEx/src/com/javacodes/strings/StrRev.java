package com.javacodes.strings;

public class StrRev {

	public static void main(String[] args) {

String str = "KINGOFJAVA";//10
		
		
		String rev ="";
		 for(int i=str.length()-1; i>=0; i--) {
		  
		  rev=rev+str.charAt(i);
		  
		  } System.out.println(rev);
		 
         System.out.println("------------------------------------------------------------");
		
		char a[] = str.toCharArray();
	
		for(int i=a.length-1; i>=0; i--) {
			rev=rev+a[i];
			
		}
		System.out.println(rev);
		
		System.out.println("------------------------------------------------------------");
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

	}



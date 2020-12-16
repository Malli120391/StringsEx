package com.javacodes.strings;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

       int A=0, B=1, COUNT=2;
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your A Value");
		A=sc.nextInt();
		 System.out.println("Enter your B Value");
		B=sc.nextInt();
		
		int N=0;
		if(COUNT>N) {
			
			N = A+B;
			System.out.print("The value of:"+N);	
		}
		
		N=A=B;
		B=N;
		COUNT=COUNT+1;
		sc.close();
	}

}

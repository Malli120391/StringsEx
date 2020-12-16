package com.javacodes.strings;

import java.util.Scanner;

public class Starpat {

	public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Rows");
		
		int rows = sc.nextInt();
		
		for(int i = 0; i<=rows-1; i++) {
			
			for(int s = rows-1 ; s>=i; s--) {
				
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++) {
				
				System.out.print(" *");
			}
			System.out.println(" ");
		}
    for(int i = 0; i<=rows-1; i++) {
			
			for(int s =-1 ; s<=i; s++) {
				
				System.out.print(" ");
			}
			for(int j = 0; j<=rows-2-i; j++) {
				
				System.out.print(" *");
			}
			System.out.println(" ");
		}
   sc.close();
	}
	
	}



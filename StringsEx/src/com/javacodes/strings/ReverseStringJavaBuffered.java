package com.javacodes.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringJavaBuffered {

	public static void main(String[] args) {

		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Text : ");
		String out = "";
		try {
		String enterStr=bufferedReader.readLine();
		for (int i = enterStr.length() ; i >0; i--) {
		out=out+enterStr.charAt(i-1);
		}
		
		System.out.println("Your Text : " + out);
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

}

package com.javacodes.strings;

import java.util.Arrays;

public class RemoveDuplicatevaluesArrayWoutCAPI {

	public static void main(String[] args) {

		 Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };
		 
	       
	        System.out.println(Arrays.toString(origArray));
	 
	        Integer[] tempArray = removeDuplicates(origArray);
	 
	    
	        System.out.println(Arrays.toString(tempArray));
	    }
	 
	    private static Integer[] removeDuplicates(Integer[] origArray) {
	 
	        Integer[] tempArray = new Integer[origArray.length];
	         
	        int indexJ = 0;
	        for (int indexI = 0; indexI < origArray.length - 1; indexI++) 
	        {
	            Integer currentElement = origArray[indexI];
	             
	            if (currentElement != origArray[indexI+1]) {
	                tempArray[indexJ++] = currentElement;
	            }
	        }
	         
	        tempArray[indexJ++] = origArray[origArray.length-1];
	         
	        return tempArray;
	    }
	}



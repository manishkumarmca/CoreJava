package com.manish;

public class ReveseName {
	
	
	
     public static void main(String[] args) {
	        String originalString = "Hello, World!";
	        String reversedString = reverseString(originalString);
	        System.out.println("Original string: " + originalString);
	        System.out.println("Reversed string: " + reversedString);
	    }

	    public static String reverseString(String input) {
	        char[] charArray = input.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;
	        
	      
	        while (left < right) {
	            // Swap characters at left and right indices
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            
	            // Move the pointers inward
	            left++;
	            right--;
	        }
	        
	        return new String(charArray);
	    }
	}




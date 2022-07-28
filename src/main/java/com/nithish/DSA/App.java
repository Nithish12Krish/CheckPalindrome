package com.nithish.DSA;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) {
	     
		 App ap=new App();
		 System.out.println(ap.checkForPalindrome("mam"));
		 	
	    } 	

	    public boolean checkForPalindrome(String string) {

	        LinkedList<Character> stack = new LinkedList<Character>();
	        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
	        String lowerCase = string.toLowerCase();

	        for (int i = 0; i < lowerCase.length(); i++) {
	            char c = lowerCase.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                stringNoPunctuation.append(c);
	                stack.push(c);
	            }
	        }

	        StringBuilder reversedString = new StringBuilder(stack.size());
	        while (!stack.isEmpty()) {
	            reversedString.append(stack.pop());
	        }

	        return reversedString.toString().equals(stringNoPunctuation.toString());
	    }
	    
	    
}

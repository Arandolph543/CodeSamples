/*Description: An array string is given and the longest palindrome is returned as a string.
Author:April Randolph
Date:08/22/20*/
import java.util.*;
import java.lang.*;

public class LongestPalindrome {

	static String longestSubstring(String phrase) {
		int len = phrase.length();
		int index = 0;
		//Return empty strings
		if(len == 0 || phrase.equals("")) 
			return "No palindromes";
			
		//If string has only 2 characters
		if(len <= 2) {
			if(phrase.charAt(0) == phrase.charAt(1)) {
				return phrase;			
			} else {
				return "";
			}
		}
		
		Stack palindromesStack = new Stack();
		//Loops through every character placing on the stack finding longestSubstring
		//that is a palindrome
		if(len > 2) {
			int longestCount = 0;
			palindromesStack.push(phrase.charAt(index));
			index++;
			while(index < len) {
				if(palindromesStack.search(phrase.charAt(index)) > -1) {
					if(isPalindrome(palindromesStack)) {
						int stackLength = palindromesStack.toString().length();
						if(stackLength > longestCount) {
							longestCount = stackLength;
						}
						if(index >= len && stackLength == longestCount) {
							return palindromesStack.toString();
						}
					}
				} else {
					palindromesStack.push(phrase.charAt(index));
				}
				index++;
			}
		}	
		return phrase;		
	}

	static boolean isPalindrome(Stack stackSubstring) {
		String stackPhrase = stackSubstring.toString();
		int stackLength = stackPhrase.length()/2;
		int index = 0;
		while(!stackSubstring.empty()) {
			String peek = String.valueOf(stackSubstring.peek());
			if(String.valueOf(stackPhrase.charAt(index)) == peek) {
				stackSubstring.pop();
				index++;
			} else if(stackLength - index == 1 && String.valueOf(stackPhrase.charAt(index))  != peek) {
				return true;
			}else if(index == stackLength && String.valueOf(stackPhrase.charAt(index)) != peek) {
				return false;
			}
		}
		if(stackLength == index) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String phrase = "abnnnooottooo";
		System.out.println(longestSubstring(phrase));	
	}
}

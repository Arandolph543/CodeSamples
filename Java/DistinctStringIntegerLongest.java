/*Description: Find the longest string with all distinctive characters in the String returning the length as an int. 
Author: April Randolph
Date: 03/03/20*/

import java.util.*;
import java.lang.*;

class DistinctStringIntegerLongest {

	public static int findLongestDistinctString(String s) {
		int longest = 0;
		int length = s.length();
		if(length==0)
			return 0;
	
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(String.valueOf(s.charAt(0)), 0);
		for(int i =0;i<length;i++) {
			map.put(String.valueOf(s.charAt(i)), map.getOrDefault(String.valueOf(s.charAt(i)), 0)+1);			
		}
		int tempLength = 1 ;
		for(int i = 0;i<length;i++) {
			if(((i+1)<length) && map.get(String.valueOf(s.charAt(i)))>=map.get(String.valueOf(s.charAt(i+1)))) {
				tempLength++;
			} else {
				tempLength =0;
				if((map.get(String.valueOf(s.charAt(i)))>1) && (i+1)==1) {
					tempLength = tempLength+2;
				}
			}
			if(tempLength>longest)
				longest = tempLength;
		}
	
		return longest;

	}

	public static void main(String[] args) {
		String phraseString = "aaabdbserf";
		System.out.println("Longest phrase from : " + phraseString + " " + findLongestDistinctString(phraseString));
	}

}

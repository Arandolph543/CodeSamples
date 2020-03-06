/*Description: Find the string within the string and return the index where the start of the inner string starts given as input from the user.
Author: April Randolph
Date: 03/03/20*/

import java.util.*;
import java.lang.*;
import java.io.*;

class StrStr {

	static int findStringIndex(String phrase, String findString) {
		int ind = 0;
		int lengthX = phrase.length();
		int lengthS = findString.length();
		if(lengthS>lengthX || (lengthS==0 && lengthX==0))
			return 0;
		
		if(phrase.contains(findString)) {
			for(int i = 0;i<lengthX;i++) {
				if(phrase.charAt(i)==findString.charAt(0)) {
					System.out.println("debug: " + phrase.substring(i,i+ findString.length()).toString() + i);
					if((i+lengthS)<lengthX &&phrase.substring(i,i+lengthS).equals(findString))
						return i;
				}else {
					ind = -1;
				}
			}
		}

		return ind;
	}

	public static void main(String[] args) {
		String startString = "Goodphrasethatiswords.";
		BufferedReader stringBuffer = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = stringBuffer.readLine();
			System.out.println(findStringIndex(startString, input) + " The " + startString + " at index starts the substring that is " + input);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}

}

/* Author: April Randolph
Description: Takes two string arguments and returns only the strings contains those character arguments.
*/

import java.lang.*;
import java.util.*;

public class TwoArgumentString {
	
	


	public static String[] containsCharacters(String[] arguments, String charA, String charB) {
		String[] useStrings = new String[arguments.length];
		int index = 0;
		int tempIndex = 0;
		boolean usesGivenCharacters = true;
		for(int i = 0;i<= arguments.length-1;i++) {
			CharSequence charS = arguments[i].subSequence(0, arguments[i].length());
			// System.out.println("Debug: " + String.valueOf(arguments[i]) + " " + String.valueOf(arguments[i].subSequence(0,arguments[i].length())) + "  seq length " + charS.length() );
			for(int k = 0;k <=charS.length()-1;k++) {
				if(tempIndex == i) {
					boolean characterMatchA = String.valueOf(charS.charAt(k)).equals(charA);
					boolean characterMatchB = String.valueOf(charS.charAt(k)).equals(charB);
					// System.out.println("Debug: characters " + String.valueOf(charS.charAt(k)) + " character " + characterMatchA + " " + characterMatchB);
					if(characterMatchA || characterMatchB) {
						index++;	
					}else {
						usesGivenCharacters = false;
					}						
				}
			}
			if(usesGivenCharacters) {
				useStrings[tempIndex] = arguments[i];
			}
			usesGivenCharacters = true;
			tempIndex++;
		}
		return useStrings;
	}

	public static void main(String[] args) {
		String[] charStrings = {"dssd", "sd", "dfd", "ss"};
		String[] containsChars = null;
		String A = "s";
		String B = "d";
		containsChars = containsCharacters(charStrings, A, B);
		for(String strings : containsChars) {
			if(strings != null) {
				System.out.println("Strings with s and d " + strings);
			}
		}
		
	}

}

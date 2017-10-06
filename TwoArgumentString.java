/* Author: April Randolph
Description: Takes two string arguments and returns only the strings contains those character arguments.
*/
import java.lang.*;
import java.util.*;

public class TwoArgumentString {

	public static String[] containsCharacters(String[] arguments, String charA, String charB) {
		String[] useStrings = new String[arguments.length];
		for(int i = 0;i<arguments.length;i++) {
			if(arguments[i].contains(charA) && arguments[i].contains(charB)) {
				useStrings[i] = arguments[i];
			}
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

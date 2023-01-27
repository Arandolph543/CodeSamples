/*Description: Finds the count of distinct characters in the given string.
Author: April Randolph
Date: 08/21/20*/
import java.util.*;

public class DistinctNumberOfCharacters {

	static int numberOfDistinctChars(String str) {
		int n = str.length()-1;
		Set<String> set = new HashSet<>();
		int longest = 0;
		for(int i = 0;i<n;i++) {
			int length = longest;
			set.add(String.valueOf(str.charAt(i)));
			int size = set.size();
			if((longest == 0 && size > 0) || (i+1==n)) {
				length++;
				if(i+1==n)
					longest = size;
			} else if(size > 0) {
				length++;
			} else if (size > 0 && length >= longest) {
				if(size > length) {
					longest = size;
				} else {
					longest = length + 1;
				}
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		String statementToCount = "abababcdefababcdab";
		System.out.println(numberOfDistinctChars(statementToCount));
	}
}

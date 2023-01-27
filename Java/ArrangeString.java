/* Description: Given a String find the lexicographical string and sum of numbers. 
Author: April Randolph
Date: 10/19/2019 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class ArrangeString {

	public String sortLexicallyString(String input) {
		StringBuilder builder = new StringBuilder();
		int sum = 0;
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(input);
		while(m.find()) {
		       sum += Integer.valueOf(m.group());
		}
		p = Pattern.compile("-?([A-Z]|[a-z])+");
		m = p.matcher(input);
		while(m.find()) {
			builder.append(m.group());
		}
		char[] charStrings = builder.toString().toCharArray();
		builder.delete(0, builder.toString().length());
		Arrays.sort(charStrings);
		String sorted = new String(charStrings);
		builder.append(sorted);
		builder.append(sum);
		return builder.toString();
	}

	public static void main(String[] Args) {
		String unsorted = "ASKF6HJJ8";
		ArrangeString arrange = new ArrangeString();
		System.out.println("The sorted string sum is : " + arrange.sortLexicallyString(unsorted));	
	}

}

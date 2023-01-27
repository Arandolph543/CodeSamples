/* Description: Takes two String as binary numbers.  Added the the integers as String.
Author: April Randolph
Date: 10/19/2019 */

import java.lang.*;

public class AddBinaryString {
	static String addBinary(String str1, String str2) {
		//Create the integer value of the each String
		int numToAdd = Integer.parseInt(str1, 2);
		int numToAdd2 = Integer.parseInt(str2, 2);
		String result = String.valueOf(numToAdd + numToAdd2);
		return result;		
	}
	
	public static void main(String[] args) {
		String binaryString = "11";
		String binaryString2 = "1011";
		System.out.println(addBinary(binaryString, binaryString2));
	}
}

/*Description: Take from the user the number of Subsequences as a String.  Return the longest common subsequence between the 
two.
Author: April Randolph
*/

import java.util.ArrayList;
import java.lang.*;
import java.io.*;

class LongestSubsequence {
	
	static int findCommonSubsequence(char[] phrase1, char[] phrase2, int m, int n) {
		
		if(m==0 || n==0)
			return 0;
		if(phrase1[m-1]==phrase2[n-1]) {
			return 1 + findCommonSubsequence(phrase1, phrase2,m-1, n-1);
		} else {
			return Math.max(findCommonSubsequence(phrase1, phrase2, m-1, n), findCommonSubsequence(phrase1, phrase2, m, n-1));
		}
		
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int number = Integer.parseInt(buffer.readLine());
			while(number>0) {
				String inputStr1 = buffer.readLine();
				String inputStr2 = buffer.readLine();
				int commonSubCount = findCommonSubsequence(inputStr1.toCharArray(), inputStr2.toCharArray(), inputStr1.length(), inputStr2.length());
				System.out.println("For the inputs: " + inputStr1 + " " + inputStr2 +" there's " + commonSubCount);
				number--;				
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}

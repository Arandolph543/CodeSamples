/*Description: Take from the user the number of Subsequences as a String.  Return the longest common subsequence between the 
two. Find the best space time complexity.
Author: April Randolph
*/

import java.util.ArrayList;
import java.lang.*;
import java.io.*;

class LongestSubsequence {
	
	static int findCommonSubsequence(char[] phrase1, char[] phrase2, int m, int n) {
		int[][] L = new int[m+1][n+1];
		for(int i = 0;i<=m;i++) {
			for(int j = 0;j<=n;j++) {
				if(i==0 || j==0)
					L[i][j] = 0;
				else if(phrase1[i-1]==phrase2[j-1]) {
					L[i][j] = L[i-1][j-1] + 1;
				} else {
					L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
				}
			}
		}
		return L[m][n];
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

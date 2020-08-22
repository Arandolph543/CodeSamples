/* Description: Find the length of the longest possible palindrome given an array of integers.
Author: April Randolph
Date:08/21/20 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class FindLongestPalindrome {

	static int findLongestPalindrome(char[] palindrome, int m, int n) {
		if(m==0)
			return 0;
		boolean[][] arr = new boolean[m][n];
		int length = palindrome.length;
		int longest = 1;
		String palindromeLengthString = "";
		for(int l = 0;l<length;l++) {
			for(int i = 0;i<length-1;i++) {
				int j = i+l;
				 if (palindrome[i]==palindrome[j] && (j-i<=2||arr[i+1][j-1])) {
					 arr[i][j] = true;
				 
					 if(arr[i][j]==true){
						 longest = j-i+1;
						 palindromeLengthString = new String(palindrome, i, j+1);
					 }	
				 }					 
			}
		}
		return longest;			        
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int number = Integer.parseInt(buffer.readLine());
			while(number>0) {
				String inputStr1 = buffer.readLine();
				int commonSubCount = findLongestPalindrome(inputStr1.toCharArray(), inputStr1.length(), inputStr1.length());
				System.out.println("For the inputs: " + inputStr1 + " there's " + commonSubCount);
				number--;				
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}
		
	}


}

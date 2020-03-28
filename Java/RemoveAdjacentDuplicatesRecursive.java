/*Description: Recursively remove adjacent duplicates. 
Author:  April Randolph
Date: 03/27/20
*/
import java.io.*;

public class RemoveAdjacentDuplicatesRecursive {

	static String removeAdjDuplicates(String phrase, int index, int n, String res) {
		if(index>=n) {
			if(n>=2&&(phrase.charAt(n-1)!=phrase.charAt(n-2))|| n==1) {
				res += phrase.charAt(n-1);
			} 
			return res;
		}
		char ch = phrase.charAt(index);
		
		if(index<n-2&&index+1<n-1&&ch==phrase.charAt(index+1)) {
			while(index<n-1&&ch==phrase.charAt(index+1)) {
				index++;				
			}
		} else if(index<n-1&&ch!=phrase.charAt(index+1)) {
			res += phrase.charAt(index);
		}
		return removeAdjDuplicates(phrase, index+1, n, res);		
	}

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter a number of strings enter then the string to remove the adjacent duplicates:");
			int count = Integer.parseInt(buffer.readLine());
			while(count>0) {
				String input = buffer.readLine();
				String result = removeDuplicatesAdj(input, "", 0, input.length());
				count--;
				System.out.println("The new deduplicated adjacent string character string is: " + result + " for " + input);
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}		
	}
}

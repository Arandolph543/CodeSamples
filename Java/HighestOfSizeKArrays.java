/*Description: For a given array find subarrays of k with the highest value for each.
Author: April Randolph
Date: 01/23/23
*/

import java.lang.*;
import java.io.*;
import java.util.*;

public class HighestOfSizeKArrays {

	public static void printArray(int[] arr, int n, int k) {
		int j, highest = 0;

		for(int i = 0;i<=n-k;i++) {
			highest = arr[i];
			for(j=1;j<k;j++) {
				if(arr[i+j] > highest) {
					highest = arr[i + j];
				}
			}
			System.out.print(" " + highest);
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Please enter the array of numbers, without spaces: (Press-enter)");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String inputArray = buffer.readLine();
			int n = inputArray.length();
			int[] arr = null;
			if(inputArray != null) {
				arr = new int[n];
				for(int i = 0;i<n;i++) {
					//System.out.print( inputArray.charAt(i) + " ");
					arr[i] = Integer.valueOf(String.valueOf(inputArray.charAt(i)));
					System.out.print(arr[i] + " " + inputArray.charAt(i) + " " + String.valueOf(arr[i]));
				}
			}
			System.out.println("Enter the length of a subset size of the array as k: ");
			int k = Integer.valueOf(buffer.readLine());

			printArray(arr,n, k);
		}  catch(IOException ex) {
			System.out.println(ex);
		}
	}
}

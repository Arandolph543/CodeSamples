/*Description: Given two sorted arrays give the sum of the middle elements. 
Author: April Randolph
Date: 04/09/20 */

import java.io.*;
import java.util.*;
import java.lang.*;

class SumOfMiddleElementsOfTwoSortedArrays {


	static int findNMiddleSum(int[] array1, int[] array2) {
		int len1 = array1.length;
		int len2 = array2.length;
		int sum = 0;
		if(len1<=1 || len2<=1) {
			if(len1==1 && len2==1)
				sum = (len1 + len2);
			else if(len1==0 || len2==0)
				return 0;
		}
		/* System.out.println("Debug: array sizes " + len1 + " " + len2); */
		if(len1%2==0)
			len1 = (len1/2);
		else
			len1 = (len1/2)+1;
		if(len2%2==0)
			len2 = (len2/2);
		else
			len2 = (len2/2)+1;
		sum = array1[len1-1] + array2[len2-1];
		return sum;
	}

	public static void main(String[] args) {
		try {
			int numPowerExpPairs = 0;
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the number of cases, then enter, then size of arrays separated by a space, and then the array of numbers with enter after, separated by spaces to find the middle sum: ");
    		int numberInputs = Integer.parseInt(buffer.readLine());
    		while(numberInputs>0) {
    		    String[] size = buffer.readLine().split(" ");
				String[] input1 = buffer.readLine().split(" ");
				String[] input2 = buffer.readLine().split(" ");
				int size1 = Integer.parseInt(size[0]);
				int size2 = Integer.parseInt(size[1]);
				int[] array1 = new int[size1];
				int[] array2 = new int[size2];
        		for(int i = 0;i<size1;i++) {
        		    array1[i] = Integer.parseInt(input1[i]);
        		}
        		for(int j = 0;j<size2;j++) {
					array2[j] = Integer.parseInt(input2[j]);
				}
        		numPowerExpPairs = findNMiddleSum(array1, array2);
        		numberInputs--;
    		}
			System.out.println("The number of pairs is: " + numPowerExpPairs);
	    } catch(IOException ex) {
	        System.out.println(ex.toString());
	    }
	}	


}

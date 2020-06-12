/*Description: Find the missing number or numbers in the int array returning a 1 if all numbers are negative
and the input array if all numbers are accounted for. The array is given unsorted and can contain numbers larger
than the size of the array. Return an array of the missing integers.
Author: April Randolph
Date: 03/01/20 */

import java.util.*;
import java.lang.*;
import java.io.*;

class MissingInteger {

	static int[] findIntegers(int[] A) {
		int i = 0;
		int index = 0;
		boolean foundMissingVal = false;
		int[] tempArray = new int[A.length];
		for(i = A[0];i<A.length;i++) {
			int temp;
			if(foundMissingVal) {
				temp = i+2;
			}else {
				temp = i+1;
			}
			if(A[i]!=temp) {
				tempArray[index] = temp;
				foundMissingVal = true;
				index++;
				i++;
			}
		}
		if(tempArray[0]<=0)
			System.out.println("There are no number missing in the array entered");
		return tempArray;
	}

	public static void main(String[] args) {
		 try {
	        int[] array = null;
			System.out.println("Please enter the number of arrays with missing numbers then press enter: ");
			System.out.println("Enter the array separated by spaces of increasing numbers then enter:");
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    		int numberInputs = Integer.parseInt(buffer.readLine());
    		while(numberInputs>0) {
    		    String[] arr = buffer.readLine().split(" ");
        		array = new int[arr.length];
        		for(int i = 0;i<arr.length;i++) {
        		    array[i] = Integer.parseInt(arr[i]);
        		}
				int[] result = findIntegers(array);
				for(int i =0;i<result.length;i++) {
					if(result[i]>0)
						System.out.print(result[i] + ",");
					System.out.println();
				}
        		numberInputs--;
    		}
	    } catch(IOException ex) {
	        System.out.println(ex.toString());
	    }
	}
}

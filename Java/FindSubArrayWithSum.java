/*Description: Take an array and return the sum given if in the input array.
Author: April Randolph
Date: 03/22/20*/
import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FindSubArrayWithSum {

	static ArrayList<String> findArraysOfK(int k, int[] array) {
		ArrayList<String> list = new ArrayList<String>();
		int len = array.length;
		int tempSum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<len;i++) {
			for(int j=(len-1);j>0;--j) {
				tempSum += array[j];
				if(tempSum< k || tempSum==k)
					sb.append(array[j]);
					if(tempSum==k)
						list.add(sb.toString());
				if(tempSum>k) {
					int index = sb.indexOf(String.valueOf(array[i]));
					if(index>=0)
						sb.deleteCharAt(index);
					sb.append(array[j]);
				}
			}
		}
		
		return list;
	}


	public static void main(String[] args) {
		int[] numbersArray = {3,4,5,7,2,9};
		int sum = 18;
		System.out.println("The Array given is: " + Arrays.toString(numbersArray));
		System.out.println("SubArray with total of " + sum + " is: ");
		/* int[] subArray = getSubArray(numbersArray, sum); */
		ArrayList<String> subArray = findArraysOfK(sum, numbersArray);
		for(String arrOfSum : subArray) 
			System.out.println(arrOfSum);
 		
 	}

}

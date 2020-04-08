/*Description: Given two arrays find the pairs raised to the power using both arrays where there is a pair greater than the other. 
Author: April Randolph
Date: 04/08/20*/

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
import java.lang.*;
import java.io.*;

class PairsExponential {

	static int findNumberOfExponentialPairs(int[] arr1, int[] arr2) {
		int pairs = 0, x = 0, y = 0;
		int lenArr1 = arr1.length;
		int lenArr2 = arr2.length;
		double[] temp = new double[2];
		Map<Integer, String> tempList = new HashMap<Integer, String>();
		double pow = -1;
		double tempPow = 0;
		for(int i = 0;i<lenArr1;i++) {
			for(int j = 0;j<lenArr2;j++) {
				temp[1] = -1;
				temp[0] = -1;
				if(i!=j) {
					pow = Math.pow(Double.valueOf(arr1[i]), Double.valueOf(arr2[j]));
					x = i;
					y = j;
					if(pow>0) {
						temp[0] = x;
						temp[1] = y;
					}
				}
				if(temp[1]>=0 && temp[0]>=0 && i!=temp[1] && j!=temp[0]) {
					tempPow = Math.pow(Double.valueOf(arr2[j]), Double.valueOf(arr1[i]));
					if((pow>0 && tempPow>0) && pow>tempPow) {
						pairs++;
					}
				}
				pow = 0;
				tempPow = 0;
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		try {
			int numPowerExpPairs = 0;
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the number of cases, then enter, then size of arrays separated by a space, and then the array of numbers with enter after, separated by spaces to find the number of pairs:");
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
        		numPowerExpPairs = findNumberOfExponentialPairs(array1, array2);
        		numberInputs--;
    		}
			System.out.println("The number of pairs is: " + numPowerExpPairs);
	    } catch(IOException ex) {
	        System.out.println(ex.toString());
	    }
	}
}

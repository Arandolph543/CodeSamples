/* Author: April Randolph
Description: Create all sorted arrays first from the given array A then from another array B.
Date: 08/18/2021*/

import java.lang.*;

public class CreateArraysFromAFirstThenFromB {

        //The new sorted array containing the elements from both lists print to console function taking the array and length
	void print(int[] C, int length) {
		for(int i = 0;i<length;i++) {
			System.out.print(C[i] + " ");	
		}		
		System.out.println("");			
	}

        //The function to sort the arrays creating a third array that then calls the print method checking for edge cases on input arrays
	void generateUtil(int[] A, int[] B, int[] C, int i, int j, int m, int n, int len, boolean flag) {
		if(flag) {
			if(len != 0) {
				print(C, len+1);
			}
			for(int k = i;k<m;k++) {
				if(len == 0) {
					C[len] = A[k];
					generateUtil(A, B, C, k+1, j, m, n, len, !flag);					
				} else if(A[k] > C[len]) {
					C[len++] = A[k];
					generateUtil(A, B, C, k+1, j, m, n, len++, !flag);
				}
			}
		} else {
			for(int l = j;l<n;l++) {
				if(B[l]> C[len]) {
					C[len+1] = B[l];
					generateUtil(A, B, C, i, l+1, m, n, len+1, !flag);
				}
			}
		}
	}

	//The functional call to the utility to process sort passing the created result array 
	void generate(int[] A, int[] B, int m, int n) {
	        int[] C = new int[m+n];
		generateUtil(A, B, C, 0,0,m,n,0,true);		
	}
	
	public static void main(String[] args) {
		int[] A = {8, 9, 12, 17, 39};
		int[] B = {3, 7, 11, 45, 67};
		int m = A.length;
		int n = B.length;
		CreateArraysFromAFirstThenFromB generateArrays = new CreateArraysFromAFirstThenFromB();
		generateArrays.generate(A,B, m,n);
	}
}

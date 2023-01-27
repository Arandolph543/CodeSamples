/*Description: Given an integer array of number find all the numbers each number is divisible by using the divisors
from the array given.  
Author: April Randolph
Date: 03/01/20*/ 

import java.util.*;
import java.lang.*;


class NonDivisibilitySolution {

	static int[] NonDivisibilitySolution(int[] A) {
        int len = A.length;
		int[][] B = new int[len*2][2];
		for(int i = 0;i<len;i++) {
			B[A[i]][0]++;
			B[A[i]][1] = -1;
		 }

		int largestN = 0;
		for(int i = 0;i<len;i++) {
			if(A[i]>largestN) {
				largestN = A[i];
			}
		}
		for(int i = 0;i<len;i++) {
			if(B[A[i]][1]==-1) {
				B[A[i]][1] =0;
				for(int j = 0;j<Math.sqrt(largestN)+1;j++) {
					if(j!=0) {
						if(A[i]%A[j]==0)
							B[A[i]][1]++;
						if(A[i] % j ==0 &&  A[j]/j !=j) {
							B[A[i]][1] += B[j][0];
							B[A[i]][0] += B[A[i]/j][0];
						} else if(A[i] % j==0 && A[i]/j==j) {
							B[A[i]][1] += B[j][0];
						}
					}
				}
			}
		}
		for(int i =0;i<len;i++) {
			if(((len+1) - B[A[i]][1])>0) 
				A[i] = (len+1) - B[A[i]][1];
			else 
				A[i] = 0;
		}
		return A;
	}
 

	public static void main(String[] arg) {
		int[] array = {3, 1, 2, 3, 6};
        System.out.println(Arrays.toString(NonDivisibilitySolution(array)));
	}

	


}

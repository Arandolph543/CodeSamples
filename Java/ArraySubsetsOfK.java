/* Description: Find the subsets partitioned for an array where they're equal.
Author: April Randolph
Date: 06/22/20*/
import java.util.*;
import java.lang.*;
import java.io.*;

class ArraySubsetsOfK {
                                       
	static boolean isPartitionedForKRec(int[] arr, int[] subArr, int subTotal, int K, int length, boolean[] taken, int curIndex, int limitInd) {
		int sum = 0;
		//If total for subarray is 0 return
		if(subTotal==0)
			return false;
		
		if(subArr[curIndex]==subTotal) {
			if(curIndex == K-2)
				return true;
			
			return isPartitionedForKRec(arr, subArr, subTotal, K, length, taken, curIndex+1, limitInd); 
		}
		
		//See if the subarray can have the sum excluding the last element
		for(int i = limitInd;i>=0;i--) {
			if(taken[i])
				continue;
			int tmp = subArr[curIndex] + arr[i];
			//if the temp is less than the subTotal in the subArray than add element 
			//and call recursively
			if(tmp<=subTotal) {
				taken[i] = true;
				subArr[curIndex] += arr[i];
				boolean nextArrInteger = isPartitionedForKRec(arr, subArr, subTotal, K, length, taken, curIndex-1, limitInd); 
				//After the recursive call reset the element checked and remove from tempArray
				taken[i] = false;
				subArr[curIndex] -= arr[i];
				if(nextArrInteger)
					return true;
			}
		}
		return false;
	}

	static boolean isPartitionedForK(int[] arr, int K, int N) {
		boolean[] taken = new boolean[N];
		if(K==1)
			return true;
		//Find the numbers to recursively call through and find the equal sum possible with average and sum
		int avg = 0;
		int sum = 0;
		for(int i = 0;i<N;i++) {
			sum += arr[i];
			taken[i] = false;
		}
		//Find the length of subset possible for the array
		int div = sum/K;
		
		avg = (sum/N);
		if(avg % K !=0)
			return false;
				
		//If it is possible to partition the array k times prove it is true from the average.
		int[] subArr = new int[K];
		for(int i = 0;i<K;i++) 
			subArr[i]= 0;
		
		subArr[0] = arr[N-1];
		taken[N-1] = true;
		
		//Call function to parse the subarrays and find if there is an equal sum at k		
		return isPartitionedForKRec(arr, subArr, div, K, N, taken, 0, N-1);
	}
	/* static boolean partitionForK(int[] arr, int x) {
			boolean isPartioned = false;
			int len = arr.length;
			
			int[] used = new int[len];
			for(int i = 0;i<len;i++)
				used[i] = -1;
			//Check if the array can be partitioned by number x
			if(len==0 || len<a)
				return false;

			int d = Math.ceil(len/x);
			int h = Math.floor(len/x);
			int tempSum = 0;
			if(len>=2)
				tempSum = arr[0] + arr[1];
			if(d>0) {
				used[0] = 1;
				int count = 0;
				for(int i = 0;i<arr.length;i++) {
					for(int j = i;j<x;j++) {
						
						
						if(used[i]<0 && used[j]<0 && (arr[i]+arr[j]==tempSum)) {
							isPartioned = true;
							if(arr[i]!=arr[j]) {
								used[i] = i;
								used[j] = j;
								count++;
							}
						} else if(used[i]>0 && (arr[i]+arr[j]>=tempSum)) {
							isPartioned = false;
							used[j] = 0;
							if(arr[i]!=arr[j])
								tempSum = arr[i] +arr[j];
						} else if(used[j]==-1 && (arr[i]+arr[j]<tempSum)) {
							isPartioned = true;
							used[j] = j;
							if(arr[i]!=arr[j])
								tempSum = arr[i]+arr[j];
						}
					}
				}
			}
			if(isPartioned) {
				int j = 0;
				for(int i = 0;i<len;i++) {
					if(i%k==0 || (i>k&&i<len))
						System.out.print(", ");
					if(j<len) {
						if(arr[i]+arr[j]==tempSum) {
							System.out.print(arr
						}
					}
				}
			}
				


			return isPartioned;
		}
 */

	public static void main(String[] args) {
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the array of integers to find the partitioned arrays entered with spaces:");
			String[] inputArray = buff.readLine().split(" ");
			System.out.println("Please enter the size of subarrays:");
			int subSetSize = Integer.parseInt(buff.readLine());
			int length = inputArray.length;
			int[] input = new int[length];
			for(int i =0; i<length;i++) {
				input[i] = Integer.parseInt(inputArray[i]);
			}
			boolean subsetsForK = isPartitionedForK(input, subSetSize, length);
			System.out.println("The partition for subsets of " + subSetSize + " in the array is " + subsetsForK);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}

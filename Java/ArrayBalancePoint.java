/* Description: Given and array of numbers find the summation mid-point.
Author: April Randolph
Date: 06/07/2018, 10/19/2019 */

public class ArrayBalancePoint {

	static int arrayPointBalance(int[] arr) {
		int n = arr.length;
		int i = 0, j = n-1, sum = 0, sum1 = 0;
		if(n==1)
			return 1;
		while(j>i) {
			sum+=arr[i];
			sum1+=arr[j];
			if(sum==sum1) {
				if(i+1==j || i+1==j-1) {
					return i+1;
				} else if(i==j-1) {
					return i;
				}
			}
			i++;
			j--;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {2, 3, 80, 1, 4};
		System.out.println(arrayPointBalance(array));
	}
}

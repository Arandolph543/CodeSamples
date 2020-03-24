/*Description: Find the smallest array of size k.
Author: April Randolph
Date: 10/20/2019 */

import java.util.*;
import java.lang.*;

public class FindSmallestOfK {

	static int findSmallestK(int[] array, int k) {
		Arrays.sort(array);
		return array[k-1];	
	}
	
	public static void main(String[] args) {
		int[] array = {3,5,23,54,67,21};
		int k = 3;
		System.out.print(findSmallestK(array, k));
	}
}

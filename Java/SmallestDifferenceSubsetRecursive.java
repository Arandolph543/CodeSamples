import java.util.*;

class SmallestDifferenceSubsetRecursive {


	static int findDifference(int[] array, int length, int count, int totalCount) {
		
		if(length == 0) {
			return Math.abs((totalCount-count)- count);
		}
		
		return Math.min(findDifference(array, length-1, count + array[length-1], totalCount), 
							findDifference(array, length-1, count, totalCount));
		
	}
	
	public static void main(String[] args) {
		int[] array = {1,3,4,5,6,2,0};
		int length = array.length-1;
		System.out.println("Difference subset sum is: " + findDifference(array, length, 0, array[0]));	
	}
}

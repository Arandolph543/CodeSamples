/* Description: Given an unsorted array of integers using primitive types to find the median value.
Author: April Randolph
Date: 05/28/2018, 10/21/2019 */

public class MedianOfIntegerStream {

	static int findMedian(int[] array, int index) {
		if(array.length == 0 && index == array.length) 
			return 0;
		
		if(array.length == 1 && index == 0)
			return array[0];
		
		if(index == array.length ) {
			if(index %2 == 0) {
				return (array[(index/2)-1] + array[(index/2)+1])/2;
			}else if(index%2 == 1) {
				return array[index/2];
			}
		}
		
		while(index < array.length) {
			if(index > 0 && array[index] < array[index -1]) {
				int temp = array[index];
				array[index] = array[index-1];
				array[index-1] = temp;
				index++;
				findMedian(array, index);
			} else if(index == 0){
				index++;
				findMedian(array, index);
			}else {
				break;
			}
		}
		index++;
		return findMedian(array, index);
	}

	public static void main(String[] args) {
		int[] numbers = {6,3, 4,5, 7, 8, 9};
		System.out.println(findMedian(numbers, 0));
	}
}

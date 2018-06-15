public class LargestSubArrayOfX {

	int findSmallestSubArrayOfX (int[] numbers, int largestLimit) {
		int[] largestSubarray = new int[numbers.length];
		int currentSum = 0;
		int count = 0;
		int index = 0;
		for(int l=0;l<numbers.length;l++) {
			if(numbers[l] < largestLimit && currentSum < largestLimit) {
				largestSubarray[l] = numbers[l];
				currentSum += numbers[l];
				count++;
			} else if(numbers[l] >= largestLimit) {
				return 1;
			} else if(currentSum > largestLimit) {
				currentSum -= numbers[index];
				numbers[index] = 0;
				index++;
				count--;
			}
				
		}
		return count;
	}

	public static void main(String[] args) {
		int[] numbers = {4, 4, 2, 0, 3, 8, 10, 0, 0, 14, 23, 9};
		int numHeight = 24;
		LargestSubArrayOfX smallestSubarray = new LargestSubArrayOfX();
		System.out.println(smallestSubarray.findSmallestSubArrayOfX(numbers, numHeight));
	}

}

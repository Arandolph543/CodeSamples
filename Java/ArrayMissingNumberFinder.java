public class ArrayMissingNumberFinder {

	static int findMissingNumber(int[] nums) {
		int n = nums.length - 1;
		for(int i = int[0];i<n-1;i++) {
			if(nums[i] != i) {
				return nums[i-1] + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9};
		System.out.println(findMissingNumber(numbers));
	}

}
	
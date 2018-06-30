import java.util.*;
import java.lang.*;

public class KLargest {

	public static int largest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
	}



	public static void main(String[] args) {
		int[] array = {7, 6, 5, 4, 3, 2, 1};
		int k = 2;
		System.out.println("Largest k: " + k + " " + largest(array, k));
	}
}
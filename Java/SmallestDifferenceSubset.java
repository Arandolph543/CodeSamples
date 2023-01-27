import java.util.*;

public class SmallestDifferenceSubset {


	static int getSmallestSubsetDifference(int[] array) {
		Stack<Integer> createSubset = new Stack<Integer>();
		Arrays.sort(array);
		for(int i = 0;i<array.length;i++) {
			createSubset.push(array[i]);	
		}
		int length = array.length/2 +1;
		int[] subset1 = new int[length];
		int[] subset2 = new int[length];
		int index = 0;
		while(index < length) {
			if(createSubset.empty() == false) {
				subset1[index] = createSubset.pop();
			}
			if(createSubset.empty() == false) {
				subset2[index] = createSubset.pop();
			}
			index++;
		}
		
		int sum1 = 0;
		int sum2 = 0;
		for(int m =0;m<index;m++) {
			sum1 += subset1[m];
			sum2 += subset2[m];
		}
		int difference = 0;
		if(sum1 > sum2) {
			difference = sum1 - sum2;
		}else {
			difference = sum2-sum1;
		}
		return difference;
		
	}

	public static void main(String[] args) {
		int[] array = {1,3,4,5,6,2,0};
		System.out.println("Difference of subset: " + getSmallestSubsetDifference(array));		
	}

}

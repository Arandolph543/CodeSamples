
public class ArrayKMaximumSum {

	static int[] maximumSubArrayOfK(int[] array, int k) {
		int n = array.length;
		int[] tempArray = null;
		int[] subArray = new int[n];

		int sum = 0;
		int max = 0;
		int midValue = 0;
		int index = 0;
		for(int i = 0;i<n;i++) {
			midValue += array[i];
			if(midValue > max) {
				max = midValue;
			}
			sum += array[i];
			if(sum <= midValue && sum > 0) {
				max = sum;
				subArray[index] = array[i];
				if(index >= k) {
					tempArray = new int[index];
					for(int j = 0; j<index;j++) {
						tempArray[j] = subArray[j];
					}
				}
				index++;
			}
		}
		midValue = 0;
		for(int j= 0;j<n;j++) {
			midValue+=array[j];
			sum = Math.max(midValue, sum+= array[j]);
			sum = Math.max(array[j], sum);
			if(sum > max ) {
				max = sum;
			}
			if(sum <= midValue && sum > 0) {
				subArray[j] = array[j];
			}
		}
		int[] tempArray2 = null;
		for(int l =n-1;l>=0;l--) {
			if(subArray[l] != 0 && tempArray2 == null) {
				int m = l+ 1;
				tempArray2 = new int[m];
			} 
			if(tempArray.length > 0 && (subArray[l] != 0)) {
				tempArray2[l] = subArray[l];
			}
		}
		return (tempArray2 == null ? tempArray : tempArray2);
	}

	public static void main(String[] args) {
		int k = 4;
		int[] numbers = {2,3, -5, -8, 12, 3, 3};
		int[] subarray = maximumSubArrayOfK(numbers, k);
		int n = subarray.length;
		for(int i = 0;i<n;i++){
			System.out.print(subarray[i]  + "  ");
		}
	}
}

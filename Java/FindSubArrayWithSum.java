public class FindSubArrayWithSum {

	static int[] getSubArray(int[] numbers, int totalSum) {
		int[] subArray = new int[2];
		int tempSum, index = 0;
		subArray[0] = 0;
		tempSum  = numbers[0];
		for(int l=1;l<numbers.length;l++) {
			if(tempSum == totalSum){
				subArray[1] = l;
				return subArray;
			}else if(tempSum > totalSum) {
				tempSum -= numbers[index];
				subArray[0]= index++;
				if(tempSum == totalSum) {
					subArray[1] = l;
					return subArray;
				}
			}
			tempSum += numbers[l];
		}
		return subArray;
	}


	public static void main(String[] args) {
		int[] numbersArray = {3,4,5,7,2,9};
		int sum = 18;
		System.out.println("SubArray with total of " + sum + " is: ");
		int[] subArray = getSubArray(numbersArray, sum);
		for(int i = 0; i<subArray.length;i++) {
			System.out.print(subArray[i] + " ");
		}
	}

}

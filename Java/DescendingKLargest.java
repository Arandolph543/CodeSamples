public class DescendingKLargest {

	static int[] KLargestDescending(int[] numbers, int k) {
		int length = numbers.length-1;
		int largest = Integer.MIN_VALUE;
		int secondLargest = 0;
		List<Integer> largest = new ArrayList<>(k);
		int s, m, n = 0;
		if(length < k) {
			return;
		}
		largest = numbers[0];
		while(s < length) {
			System.out.println("Debug: " + largest[m] + " " + m + " " + s + " " + length);
			if(!largest) {
				kLargest
			} else if(numbers[s] > largest[m] && numbers[s] != largest[m]) {
				largest[m] = numbers[s];
				m++;
			} else if(numbers[s] > largest[m+1] && numbers[s] != largest[m+1]) {
				largest[m+1] = numbers[s];
				m++;
			}
			for(int i = 0;i<k-1;i++) {
				if(numbers[s] > largest.get(i)) {
					largest.add(i, numbers[s]);
				}
			}
			s++;
		}
		return largest;		
	}

	public static void main(String[] args) {
		int[] digits = {58, 12, 43, 76, 3, 15};
		int k = 2;
		int[] klda = KLargestDescending(digits, k);
		for(int largeItem: klda) {
			System.out.println(largeItem);
		}
	}
}

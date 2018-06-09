
public class ArrayMajorityElement {

	static int[] found;
	
	static String findMajorityNumber(int[] numbers, int n) {
		int majority = 0;
		int m = found.length;
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(i == numbers[j]) {
					found[i]++;
				}
				if(found[i] > majority) {
					majority = found[i];
				}
			}
		}
		if(majority > n/2) {
			return String.valueOf(majority);
		} else {
			return "No majority element.";
		}
	}

	public static void main(String[] args) {
		ArrayMajorityElement ame = new ArrayMajorityElement();
		int[] numbers = {3, 3, 4, 2, 3};
		int length = numbers.length;
		found = new int[10];
		for(int i = 0;i<10;i++) {
			found[i] = 0;
		}
		
		System.out.println(findMajorityNumber(numbers, length));		
	}
}

import java.util.*;

class SameInt {

	public static boolean findSameInteger(int[] numbers) {
		boolean sameInteger = false;
		List<Integer> duplicates = new ArrayList<Integer>();
		for(int i = 0; i<numbers.length-1;i++) {
			if(duplicates.size() == 0) {
				duplicates.add(numbers[i]);
			} else if(duplicates.contains(numbers[i])) {
				sameInteger = true;
			} else {
				duplicates.add(numbers[i]);
			}
		}
		
		return sameInteger;
	}

	public static int findSameIntegerIndex(int[] numbers) {
		int sameIntegerIndex = 0;
		List<Integer> duplicates = new ArrayList<Integer>();
		for(int i = 0; i<numbers.length-1;i++) {
			if(duplicates.size() == 0) {
				duplicates.add(numbers[i]);
			} else if(duplicates.contains(numbers[i])) {
				sameIntegerIndex = i;
			} else {
				duplicates.add(numbers[i]);
			}
		}
		
		return sameIntegerIndex;
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,4,5,5,9};
		SameInt classSameInt = new SameInt();
		//boolean sameIntegerFound = classSameInt.findSameInteger(array);
		int sameIntegerIndex = classSameInt.findSameIntegerIndex(array);
		System.out.println("Same integer found: " + sameIntegerIndex);
	}

}

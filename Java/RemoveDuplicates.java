import java.util.*;

public class RemoveDuplicates {
	static Set<Integer> set;
	
	static Set<Integer> removeDuplicates(int[] array) {
		set = new HashSet<>();
		int n = array.length;
		for(int i =0;i<n;i++) {
			set.add(array[i]);
		}
		if(set.size() < n) {
			System.out.println("There were duplicates.");
		}
		return set;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 3, 5, 4, 1};
		set = removeDuplicates(arr);
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		for(Integer item: set) {
			System.out.println(" ");
			System.out.print(item + " ");			
		}
	}
}

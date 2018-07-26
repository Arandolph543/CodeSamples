import java.util.*;
import java.lang.*;

public class FindSmallestOfK {

	static int findSmallestK(Integer[] array, int k) {
		List<Integer> list = null;
		try {
			list = Arrays.asList(array);
			Collections.sort(list);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.toString());
		}
		return list.get(k-1);	
	}
	
	public static void main(String[] args) {
		Integer[] array = {3,5,23,54,67,21};
		int k = 3;
		System.out.print(findSmallestK(array, k));
	}
}

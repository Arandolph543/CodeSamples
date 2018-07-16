import java.util.*;
import java.lang.*;

public class ArraySort {

	public static void main(String[] args) {
		int[] numbers = {0,2,1,2,1};
		Arrays.sort(numbers);
		int n = numbers.length;
		for(int i = 0;i<n;i++) {
			System.out.print(numbers[i]);
		}
	}
}
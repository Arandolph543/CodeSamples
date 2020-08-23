/*Description: Finds the largest subarray of the fibinacci sequence of a given array.
Author: April Randolph
Date:08/22/20*/
import java.util.*;
public class LargestSubsetFibonacci {

	public List<Integer> findFibonacciSubset(List<Integer> arr, List<Integer> seqFibonacci) {
		List<Integer> subset = new ArrayList<>();
		for(Integer number: arr) {
			if(seqFibonacci.contains(number)) {
				subset.add(number);
			}
		}
		return subset;
	}
		
	public static int fibinocciRec(int fibNum) {
		if(fibNum == 0) 
			return 0;
		if(fibNum < 2) 
			return 1;
		return fibinocciRec(fibNum -1) + fibinocciRec(fibNum - 2);		
	}
			
	public static void main(String[] args) {
		LargestSubsetFibonacci lsf = new LargestSubsetFibonacci();
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> fibonacciSeq = new ArrayList<>();

		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(10);
		arrayList.add(3);
		int limit = 10;
		int num = 0;
		for(int i =0;i<limit;i++) {
			fibonacciSeq.add(fibinocciRec(i));
		}
		arrayList = lsf.findFibonacciSubset(arrayList, fibonacciSeq);
		arrayList.forEach(integer -> {System.out.print(integer + " ");});
		
	}
		
		
		







}

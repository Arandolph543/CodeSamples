import java.util.*;

public class BubbleSort {
	
	public HashMap bubbleSort(int[] array) {
		int i = 0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		/* compares the index to put the higher value in the higher index */
		for(int k=array.length; k > 0;k--) {
			for(int h =0;h < array.length -1;h++) {
				if(array[h] > array[h+1]) {
					map.put(array[h], h+1);
					map.put(array[h+1], h);
				} else {
					map.put(array[h],1);
				}
			}
		}	
		return map;
	}

	public static void main(String arr[]) {
		BubbleSort bsor = new BubbleSort();
		int[] list = {2,5,1,6,3};
		Map<Integer, Integer> sortedMap = bsor.bubbleSort(list);
		for(Integer el : sortedMap.keySet()) {
			System.out.print(el);
		}			
	}	
}

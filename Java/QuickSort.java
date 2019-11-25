import java.util.*;
import java.lang.*;
import java.io.*;

class QuickSort {


	public static int partition(int[] arr, int low, int high) {
		int i = low-1;
		int pivot = arr[high];
		for(int k =low;k<high;k++) {
			//element is less than pivot
			if(arr[k] < pivot) {
				i++;
				//swap with arr[i]
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				
			}
		}
		
		int swap =  arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = swap;		
		return i+1;
	}


	public static int[] sort(int[] array, int i, int j) {
		if(i<j) {
			int pari = partition(array, 0, j);
			
			sort(array, i, pari-1);
			sort(array, pari-1, j);
		}
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the number array for quick sort:");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int[] integerlist = {};
		int arrIndex = 0 ;
		try {
			int length = Integer.valueOf(buffer.readLine());
			integerlist = new int[length];
			String x = "";
			while((x = buffer.readLine())!= null) { 
				integerlist[arrIndex] = Integer.valueOf(x.toString());
				arrIndex++;
			}
		} catch(IOException ex) {
			System.out.print(ex);
		}
		
		integerlist = sort(integerlist, 0, integerlist.length-1);
		System.out.print(Arrays.toString(integerlist));
	}


}

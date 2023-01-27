import java.util.*;
import java.lang.*;
import java.io.*;

class QuickSort {

	public static int partition(int[] arr, int low, int high) {
		int i = low-1;
		System.out.println("Debug: " + arr[low] + " " + low + " " + high);
		int pivot = arr[high-1];
		for(int k =low;k<high;k++) {
			//element is less than pivot
		System.out.println("Debug: " + arr[k] + " " + pivot + " " + i);
			if(arr[k] < pivot) {
				i++;
				//swap with arr[i]
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				
			}
		}
		int swap =  arr[high-1];
		arr[high-1] = arr[i+1];
		arr[i+1] = swap;
		
		return i+1;
	}

	public static int[] sort(int[] array, int i, int j) {
		if(i<j) {
			int pari = partition(array, 0, j);
			
			sort(array, i, pari-1);
			sort(array, pari+1, j);
		}
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the number array for quick sort:");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int arrIndex = 0 ;
		try {
			int length = Integer.parseInt(buffer.readLine());
			String[] arrInput = buffer.readLine().split(" ");
			int[] integerlist = new int[arrInput.length];
			for(int i = 0;i<arrInput.length;i++) {
				integerlist[i] = Integer.parseInt(arrInput[i]);
			}
			integerlist = sort(integerlist, 0, integerlist.length);
			System.out.print(Arrays.toString(integerlist));
			
		} catch(IOException ex) {
			System.out.print(ex);
		}
		
	}
}

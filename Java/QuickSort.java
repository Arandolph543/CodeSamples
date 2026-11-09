 import java.util.*;
import java.lang.*;
import java.io.*;

class QuickSort {

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		//index of smaller of the right position of pivot
		int i = low-1;
		//move all smaller elements to the left side
		for(int k =low;k<high-1;k++) {
			//element is less than pivot
			if(arr[k] < pivot) {
				i++;
				//swap with arr[i]
				swap(arr,i,k);
			}
		}
		//move pivot after smaller elements and return its postion
		swap(arr, i+1, high);
		return i+1;
	}
	static void swap(int[] arr, int i, int j) {
		int temp arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public static int[] sort(int[] array, int low, int high) {
		if(low<high) {
			int pari = partition(array, low, high);
			
			sort(array, low, pari-1);
			sort(array, pari+1, high);
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

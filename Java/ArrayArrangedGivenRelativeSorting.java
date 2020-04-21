/*Description: Given the number of inputs with the second line the array lengths then the two arrays for each input find the relative sorting.
Author: April Randolph
Date: 03/22/20
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayArrangedGivenRelativeSorting {
    
    static int[] arrangeArray(int[] arr1, int[] arr2) {
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        int[] arrangedArray = new int[lenArr1];
        int index = 0;
        int[] usedArray = new int[lenArr1];
		for(int k =0;k<lenArr1;k++) {
			usedArray[k]=0;			
		}
		int arrIndex = 0;
		
		if(lenArr2 <= lenArr1) {
			for(int i = 0;i<lenArr2;i++) {
				for(int j = 0;j<lenArr1;j++) {
					if(arr1[j]==arr2[i]) {
						arrangedArray[arrIndex] = arr1[j];
						usedArray[j] = 1;
						index = j;
						arrIndex++;
					} 
				}
			}
		}
		
		int placeCount = lenArr1 - index;
		int[] extraArrayToSort = new int[placeCount];
		arrIndex = 0;
        for(int k =0;k<lenArr1;k++) {
			if(usedArray[k]==0) {
				extraArrayToSort[arrIndex] = arr1[k];
				arrIndex++;
			}
        } 
		Arrays.sort(extraArrayToSort);
		arrIndex = 0;
		for(int k =0;k<placeCount;k++) {
			arrangedArray[index+k] = extraArrayToSort[k];
	    }
		
        return arrangedArray;
    }
    
	public static void main (String[] args) {
	    try {
	        int[] arrangedArray = null;
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    		int numberInputs = Integer.parseInt(buffer.readLine());
    		while(numberInputs>0) {
    		    String[] sizes = buffer.readLine().split(" ");
        		int[] array1 = new int[Integer.parseInt(sizes[0])];
        		int[] array2 = new int[Integer.parseInt(sizes[1])];
        		String[] arr1 = buffer.readLine().split(" ");
        		String[] arr2 = buffer.readLine().split(" ");
        		for(int i = 0;i<Integer.parseInt(sizes[0]);i++) {
        		    array1[i] = Integer.parseInt(arr1[i]);
        		}
        		for(int j =0;j<Integer.parseInt(sizes[1]);j++) {
        		    array2[j] = Integer.parseInt(arr2[j]);
        		}
        		arrangedArray = arrangeArray(array1, array2);
        		numberInputs--;
    		}
			 for(int k =0;k<arrangedArray.length;k++) {
				 System.out.print(arrangedArray[k] + " ");
			 }
	    } catch(IOException ex) {
	        System.out.println(ex.toString());
	    }
	}
}

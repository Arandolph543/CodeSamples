import java.util.*;
import java.lang.*;
import java.io.*;

class ArrangeArrayAlternatingSort {
    
    static int[] arrangeArray(int[] arr) {
        int highInd = arr.length-1;
        int lowInd = 0;
		int index = 0;
        int[] arrArranged = new int[arr.length];
        for(int i = arr.length-1;i>-1;--i) {
            if((i %2)==1) {
                arrArranged[index] = arr[highInd];
				highInd--;
            } 
			if((i%2)==0) {
				arrArranged[index] = arr[lowInd];
				lowInd++;
			}
			index++;
        }
        return arrArranged;
    }
    
    
	public static void main (String[] args) {
	    try {
    		int[] arrangedArray = null;
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    		int numberInputs = Integer.parseInt(buffer.readLine());
    		while(numberInputs>0) {
    		    int size = Integer.parseInt(buffer.readLine());
        		String[] arr1 = buffer.readLine().split(" ");
        		int[] array1 = new int[arr1.length];
        		arrangedArray = new int[arr1.length];
        		for(int i = 0;i<size;i++) {
        		    array1[i] = Integer.parseInt(arr1[i]);
        		}
        		arrangedArray = arrangeArray(array1);
				for(int i = 0;i<arrangedArray.length;i++)
					System.out.print(arrangedArray[i] + " ");
        		numberInputs--;
    		}
	    } catch(IOException ex) {
	        System.out.println(ex.toString());
	    }
	}
}
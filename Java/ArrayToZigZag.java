/*Description: Array of Integers that is then Zig-Zagged given an unsorted array. 
Author: April Randolph
Date: 04/09/20 */
import java.util.Arrays;
import java.lang.*;
import java.io.*;

class ArrayToZigZag {

	static int[] toZigZag(int[] array) {
		int len = array.length;
		if(len<3)
			System.out.println("The array is too small to zigzag");
		int i = 0;
		boolean flag = false;
		for(i=0;i<len;i++) {
			
			if(i+1<len && flag && array[i]>array[i+1]) {
				int temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
			} else if(i+1<len && !flag && array[i]<array[i+1]) {
				int temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
			} else if(i+1<len && flag && array[i]<array[i+1]) {
				i++;
			} else if(i+1<len && flag && array[i]>array[i+1]) {
				i--;
			}			
		}
		
		return array;
	}

	public static void main(String[] args) {
		try {
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the number of cases, then enter, then size of array, and then the array of numbers with enter after, separated by spaces to a zigzaged result: ");
    		int numberInputs = Integer.parseInt(buffer.readLine());
    		while(numberInputs>0) {
    		    int size = Integer.parseInt(buffer.readLine());
				int[] zigzag = new int[size];
				String[] input1 = buffer.readLine().split(" ");
				int[] array1 = new int[size];
        		for(int i = 0;i<size;i++) {
        		    array1[i] = Integer.parseInt(input1[i]);
        		}
     
        		zigzag = toZigZag(array1);
        		numberInputs--;
				for(int i = 0;i<zigzag.length;i++) {
					System.out.print(zigzag[i] + " ");
				}
    		}
	    } catch(IOException ex) {
	        System.out.println(ex.toString());
	    }
	}
}

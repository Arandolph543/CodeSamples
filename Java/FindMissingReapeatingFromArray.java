/*Description: The array is an unsorted array containing a missing number and a repeating number. Returning  these two integers. 
Author: April Randolph
Date: 02/14/2020*/
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;
import java.io.*;

class FindMissingReapeatingFromArray {
	
	static int[] findMissingReapeatingFromArray(Integer[] number, int length) {
		Collections.sort(Arrays.asList(number));
		List list = new ArrayList<>(Arrays.asList(number));
		Set<Integer> set = new HashSet<Integer>(list);
		int[] array = new int[2];
		int num = 0;
		if(length>set.size()) {
			for(int i = 0;i<length;i++) {
				if(num!=number[i] && set.contains(number[i]) && !set.contains(num)) {
					num++;
					array[0] = num;
				} 
				if(num!=number[i] && set.contains(number[i])) {
					array[1] = number[i];
				}
				num++;
			}
		}else {
			array[0] = -1;
		}
		return array;
	}

	public static void main(String[] args) {
		try {
			int[] arrangedArray = null;
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the number of cases then enter then size of array and then the array of numbers seperated by spaces to find the missing repeating numbers:");
    		int numberInputs = Integer.parseInt(buffer.readLine());
    		while(numberInputs>0) {
    		    int size = Integer.parseInt(buffer.readLine());
        		String[] arr1 = buffer.readLine().split(" ");
				Integer[] array1 = new Integer[size];
        		for(int i = 0;i<size;i++) {
        		    array1[i] = Integer.parseInt(arr1[i]);
        		}
        		arrangedArray = findMissingReapeatingFromArray(array1, size);
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

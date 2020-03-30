/*Description: Find the median of stream.
Author: April Randolph
Date: 03/28/20*/
import java.util.Arrays;
import java.io.*;

class FindMedianOfStream {

	static int[] findStreamIntMedianOnInsertion(int[] n) {
		int[] median = new int[n.length];
		int index = 0;
		int sum = 0;
		while(index<n.length) {
			sum += n[index];
			median[index] = (sum + n[index])/2;
			index++;
		}
		return median;
	}

	public static void main(String[] args) {
		int[] streamInputIntegers = {5, 15, 1, 3};
		System.out.println("The array " + Arrays.toString(streamInputIntegers) + " medians are " + Arrays.toString(findStreamIntMedianOnInsertion(streamInputIntegers)));
	}	

}

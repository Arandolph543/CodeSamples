/*Description: Given an unsorted array that then finds the element that to left is smaller than the element and larger to the right of. 
Author: April Randolph
Date:04/03/20*/

import java.io.*;

class FindElementMid {

	static int findElement(int[] arr) {
		int mid = arr[0];
		int length = arr.length;
		int tempMid = (length/2)+1;
		for(int i = 0;i<tempMid;i++) {
			for(int j = 0;j<length;j++) {
				if(arr[j]>mid && j+1<length && arr[j+1]>mid && arr[j+1]>arr[j])
					mid = arr[j];
			}
		}
		
		return mid;
	}

	public static void main(String[] args) {
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the number of cases then enter and each array of numbers separated by spaces");
			int countStacks = Integer.parseInt(buf.readLine());
			int[] numArray;
			while(countStacks>0) {
				String[] input = buf.readLine().split(" ");
				numArray = new int[input.length];
				for(int i = 0;i<input.length;i++) {
					numArray[i] = Integer.parseInt(input[i]);
				}
				System.out.print("The smallest element in ");
				for(Integer item : numArray)
					System.out.print(item + " ");
				int newOrderedArray = findElement(numArray);
				System.out.println(" is " + newOrderedArray);
				countStacks--;
			}
			
		} catch(IOException ex) {
			System.out.println(ex);			
		}

	}

}

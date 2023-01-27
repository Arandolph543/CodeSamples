/*Description: Rotate an array. 
Author: April Randolph
Date: 02/28/2020*/

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateIntegerArrayByN {

	static int[] rotateArray(int[] arr, int n) {
		
		int length = arr.length;
		if(length==0 || length==1)
			return arr;
		
		//If there's a negative value given
		if(n<0)
			n = length - Math.abs(n);
		
		n = ((n%length) + length) % length;

		for(int i =0,gcd = gcd(n,length);i<gcd;i++) {
			int temp = arr[i];
			int j = i;
			while(true) {
				int d = j+n;
				if(d>= length) {
					d = d - length;
				}
				if(d==i) {
					break;
				}
				arr[j] = arr[d];
				j=d;
			}
			arr[j] = temp;
					
		}
		
		return arr;

	}

	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}


	public static void main(String[] args) {
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please the number or arrays to rotate then enter the length of the array and a space and the rotate amount then enter and the array with spaces: ");
			int countStacks = Integer.parseInt(buf.readLine());
			while(countStacks>0) {
				String[] inputNumbers = buf.readLine().split(" ");
				int rotateIndice = Integer.parseInt(inputNumbers[1]);
				int[] array = new int[Integer.parseInt(inputNumbers[0])];
				String[] input = buf.readLine().split(" ");
				for(int i = 0;i<input.length;i++) {
					array[i] = Integer.parseInt(input[i]);
				}
				System.out.print("The array " + Arrays.toString(array) + " " + Arrays.toString(rotateArray(array, rotateIndice)));
				countStacks--;
			}
			
		} catch(IOException ex) {
			System.out.println(ex);			
		}
    }
}

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFGArrayMissingNumber {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		while(N > 0){
		    int sizeOfArray = in.nextInt();
		    // System.out.println(sizeOfArray + " sizeOfArray");
		    int sum = 0;
		    for(int i = 0; i < sizeOfArray-1; i++){
		        int enteredNum = in.nextInt();
		        // System.out.println(enteredNum + " num " + N);
		        sum += enteredNum;
		    }
		    int num = (sizeOfArray*(sizeOfArray+1)/2) - sum;
		    System.out.println(num);
		    N--;
		}
	}
}
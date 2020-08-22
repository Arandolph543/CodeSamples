/*Description: Array of integers finds the missing number in the array. 
Author: April Randolph
Date: 08/21/20*/
import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayMissingNumber {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		while(N > 0){
		    int sizeOfArray = in.nextInt();
		    int sum = 0;
		    for(int i = 0; i < sizeOfArray-1; i++){
		        int enteredNum = in.nextInt();
		        sum += enteredNum;
		    }
		    int num = (sizeOfArray*(sizeOfArray+1)/2) - sum;
		    System.out.println(num);
		    N--;
		}
	}
}

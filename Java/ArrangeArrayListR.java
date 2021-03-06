/*Description: Given an integer array give the sorted array in O(N) as ArrayList.
Author: April Randolph
Date: 07/29/2011, 10/19/2019, 02/06/2020*/
import java.util.*;
import java.io.*;

class IntegerRangeofInput {

	public ArrayList orderList(int[] array) {
		Arrays.asList(array);
		
		return Arrays.sort(array);
		
	}

	public static void main(String[] args) {
		int[] integerlist={};
		System.out.println("Please enter the range details:");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		IntegerRangeofInput irclass = new IntegerRangeofInput();
		integerlist=buffer.readline();
		if(buffer.read()) {
			integerlist = irclass.orderList(integerlist);
		}
		for(int i=0;i<integerlist.length();i++) {
			System.out.println(integerlist[i]);
		}
	}

}

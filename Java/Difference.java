/*Description: Takes an array of integers and an integer of a given difference and returns as many possible pairs of number that can be used to find the difference.
Author: April Randolph
Date:08/21/20 */
import java.util.*;
import java.io.*;

public class Difference {
	
	public static Map<Integer, Integer> numberOfDifferences(Integer[] integerArray, int difference) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		for(int i = 0; i<integerArray.length;i++) {
			for(int k = 0;k<integerArray.length;k++) {
				if(((integerArray[i] + integerArray[k]) == difference) || ((integerArray[i] - integerArray[k]) == difference) && i != k) {
					if(!pairs.containsKey(integerArray[i]) || !pairs.containsKey(integerArray[k])){
						if(!checkIfContains(pairs, integerArray[i],integerArray[k])) {
							pairs.put(integerArray[i], integerArray[k]);					
						}
					}
				}
			}
		}
		return pairs;
	}

	public static boolean checkIfContains(Map<Integer, Integer> pairs, int a, int b) {
		boolean contains = false;
		for(Map.Entry<Integer, Integer> pair : pairs.entrySet()) { 
			Integer key = pair.getKey();
			Integer value = pair.getValue();
			if((a == key && b== value) || a==value && b==key){
				return true;
			} else {
				return false;
			}
		}
		return contains;
	}
	
	public static void main(String[] args) {
		Difference intDifCls = new Difference();
		String[] inputIntegers = null;
		Integer[] integers = null;
		Map<Integer,Integer> pairs = new HashMap<Integer, Integer>();
		int numberOfElements = 0;
		int difference = 0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter the number of numbers for your array?");
			numberOfElements = Integer.parseInt(buffer.readLine());
			inputIntegers = new String[numberOfElements];
			integers = new Integer[numberOfElements];
			System.out.println("Please enter an array of integers separarted by spaces: " );
			inputIntegers = buffer.readLine().split("\\s");
			System.out.println("Please enter the number for finding difference?");
			difference = Integer.parseInt(buffer.readLine());
			for(int i = 0;i<inputIntegers.length;i++) {
				integers[i] = Integer.parseInt(inputIntegers[i]);
			}
			pairs = intDifCls.numberOfDifferences(integers, difference);
			for(Map.Entry<Integer, Integer> pair : pairs.entrySet()) { 
				System.out.println("Pair : " + pair.getKey() + ", " + pair.getValue());
			}
		} catch(Exception ex) {
			System.out.println(ex.toString());			
		}
		
		
		
	}
	
}

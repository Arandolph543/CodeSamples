/*Description: Stack sort using recursion. 
Author: April Randolph
Date: 03/10/21*/

import java.util.Stack;
import java.util.*;
import java.io.*;

class SortAStack {
  
  static void insertedSort(Stack<Integer> s, int m) {
      if(s.isEmpty() || m>s.peek()) {
        s.push(m);
        return;
      }
      int temp = s.pop();     
      insertedSort(s, m);
      s.push(temp);
  }
  
  static void rSortStack(Stack<Integer> s) {
         if(!s.isEmpty()) {  
               int temp = s.pop();
               rSortStack(s);
               insertedSort(s, temp);
         }
  }
  
	static Stack<Integer> sortStack(Stack<Integer> unsorted) {
		int length = unsorted.size();
		Object[] arrStack = unsorted.toArray();
		Arrays.sort(arrStack);
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i =0;i<length;i++) {
			stack.add((int)arrStack[i]);
		}	
		return stack;
	}
 
	static void printSortedStack(Stack<Integer> orderedIntStack) {
		int length = orderedIntStack.size();
		for (int i = 0;i<length;i++) 
			System.out.println(orderedIntStack.get(i));
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the number of Stacks then hit return and separate the numbers by spaces.");
			int countStacks = Integer.parseInt(buf.readLine());
			Stack<Integer> stack = new Stack<Integer>();
			while(countStacks>0) {
				String[] input = buf.readLine().split(" ");
				for(int i = 0;i<input.length;i++) {
					stack.push(Integer.parseInt(input[i]));
				}
				Stack<Integer> newOrderedArray = sortStack(stack);
        Statck<Integer> orderedArray = rSortStack(stack);
        //Print the sorted array recursively sorted
        printSortedStack(orderedArray);
        //Print the sorted array from using a temp stack 
				printSortedStack(newOrderedArray);
			}
			
		} catch(IOException ex) {
			System.out.println(ex);			
		}
	}

}

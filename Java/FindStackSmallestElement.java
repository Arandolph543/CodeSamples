/*Description: Remove the least number from the stack. 
Author: April Randolph
Date: 03/24/20*/
import java.util.*;
import java.io.*;

class FindStackSmallestElement {


	static int findLeastElement(Stack<Integer> a) {
		int length = a.size();
		if(length==0)
			return a.pop();
		
		int minimum = a.pop();
		while(!a.empty()) {
			int next = a.pop();
			if(minimum>next) {
				minimum = next;
			}
		}
		return minimum;
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
				System.out.print("The smallest element in ");
				stack.forEach(x ->{System.out.print(" "+x);});
				int newOrderedArray = findLeastElement(stack);
				System.out.println(" is " + newOrderedArray);
				countStacks--;
			}
			
		} catch(IOException ex) {
			System.out.println(ex);			
		}
	}

}

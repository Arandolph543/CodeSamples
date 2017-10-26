/* Author: April Randolph
Description: A set of functions that implement stack with push, pull, size, and isEmpty. 
Date: 06/27/17
*/

import java.lang.*;
import java.util.*;

public class StackFunctionsImplementation {//implements Stack {

	private String[] stack;
	private int topOfStack = -1;
	private int size;
	
	public static void main(String[] args) {
		StackFunctionsImplementation cleanedStack = new StackFunctionsImplementation(8);
		cleanedStack.push("1");
	}
	
	public StackFunctionsImplementation(int currentSize) {
		size = currentSize;
		stack = new String[size];
		/* Arrays.fill */
	}
	
	public String[] pop(String item) {
		String[] newStack = new String[size-1];
		for(int i = 0;i<size-1;i++) {
			if(stack[i] != item) {
				newStack[i] = stack[i];
			} 
		}
		return newStack;
	}
	
	public void push(String item) {
		if(stack.length < size) {
			stack[stack.length+1] = item;
		}
	}
	
	public String peeking() {
		Integer index = size -1;
		return stack[index].toString();
	}
	
	public int search(String item) {
		int searchContents = -1;
		int index = 0;
		for(String foundItem: stack) {
			if(foundItem.equals(item)) {
				searchContents = index;
			}
			index++;
		}
		return searchContents;
	}
	
	public boolean isEmpty() {
		boolean empty = false;
		if(size > 0 && stack.length > 0) {
			empty =  false;
		} else {
			empty =  true;
		}
		return empty;
	}

}

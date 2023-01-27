/*Description: Converts a ternary string into a binary tree.
Author:April Randolph
Date: 4/28/2018, 05/21/2019 */

import java.lang.*;
import java.util.*;

class ConvertTernaryIntoBinaryTree {
	
	class Node {
		char data;
		Node left;
		Node right;
		Node(char num) {
			this.data = num;
			left = right = null;
		}
	}

	Node parseTernaryValueIntoArray(char[] inputStatement, int index) {
		
		if(index >= inputStatement.length)
			return null;

		Node root = new Node(inputStatement[index]);
		
		++index;
		
		if(index < inputStatement.length && inputStatement[index] == ':') {
			root.left = parseTernaryValueIntoArray(inputStatement, index+1);
		} else if(index < inputStatement.length) {
			root.right = parseTernaryValueIntoArray(inputStatement, index+1);
		}
			
		return root;
	}

	void printTree(Node tree) {
		if(tree == null) 
			return;
		
		System.out.print(tree.data);
		printTree(tree.left);
		printTree(tree.right);
	}	
	
	public static void main(String[] args) {
		ConvertTernaryIntoBinaryTree convertFromClass = new ConvertTernaryIntoBinaryTree();
		String ternaryOperator = "a?b?c?d:e:f";
		char[] array = ternaryOperator.toCharArray();
		Node node = convertFromClass.parseTernaryValueIntoArray(array, 0);
		convertFromClass.printTree(node);	
	}

}

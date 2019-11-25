/* Description: Given a binary tree convert to BST keeping the structure of the tree. 
Author: April Randolph
Date: 05/28/2018, 10/21/2019 */

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Node {

	int data;
	Node left,right;
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class ConvertTreeIntoBST {

	Node root;
	List<Integer> list = new ArrayList<Integer>();
	Stack<Integer> stack = new Stack<>();
	
	void dfs(Node tree) {
		if(tree == null) return;
		dfs(tree.left);
		list.add(tree.data);
		dfs(tree.right);	
	
	}
	void contructTree(Node root) {
		if(root == null) 
			return;

		contructTree(root.left);
		if(!stack.empty()) 
			root.data = stack.pop();
		contructTree(root.right);	
	}

	Node convertBinaryToBST(Node root) {
		dfs(root);
		Collections.sort(list);
		Collections.reverse(list);
		list.forEach(System.out::println);
		stack.addAll(list);
		
		contructTree(root);
		return root;		
	}
	
	public static void main(String[] args) {
		ConvertTreeIntoBST tree = new ConvertTreeIntoBST();
		tree.root = new Node(4);
		tree.root.left = new Node(6);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(5);
		tree.root.right.left = new Node(4);
		tree.root.right.left.left = new Node(1);
		Node binarySearchTree = tree.convertBinaryToBST(tree.root);
	}
}

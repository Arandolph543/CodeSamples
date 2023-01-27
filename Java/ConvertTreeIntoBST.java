/* Description: Given a binary tree convert to BST keeping the structure of the tree. 
Author: April Randolph
Date: 05/28/2018, 10/21/2019 */

import java.lang.*;
import java.util.*;
import java.io.*;

import java.util.List;
import java.util.Stack;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

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
		list.forEach(System.out::print);
		stack.addAll(list);
		
		contructTree(root);
		return root;		
	}
	
	public static void main(String[] args) {
		ConvertTreeIntoBST treeCTIBclass = new ConvertTreeIntoBST();
		System.out.println("Please enter the numbers from pre-order input of Binary tree (six is the tree size): ");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		List<String> listIntegers = new ArrayList<>();
		String[] array = null;
		try {
			String input = buffer.readLine();
			if(input!=null) {
				array = input.split(" ");
				for(String item: array) {
					listIntegers.add(item);
				}
			}
			treeCTIBclass.root = new Node(new Integer(listIntegers.get(0)));
			treeCTIBclass.root.left = new Node(Integer.parseInt(listIntegers.get(1))); 
			treeCTIBclass.root.right = new Node(Integer.parseInt(listIntegers.get(2)));
			treeCTIBclass.root.left.left = new Node(Integer.parseInt(listIntegers.get(3)));
			treeCTIBclass.root.right.left = new Node(Integer.parseInt(listIntegers.get(4)));
			treeCTIBclass.root.right.left.left = new Node(Integer.parseInt(listIntegers.get(5)));
		} catch(IOException ex) {
			System.out.println(ex);
		}
  		Node binarySearchTree = treeCTIBclass.convertBinaryToBST(treeCTIBclass.root);
	}
}

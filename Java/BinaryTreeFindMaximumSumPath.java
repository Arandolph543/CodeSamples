/* Finds the maximum sum path in a binary tree.
Author: April Randolph
Date: 06/21/20*/
import java.util.*;
import java.lang.*;

class Node {
	int data;
	Node right, left;
	Node(int value) {
		data = value;
		left=right=null;
	}
}

class Res {
	public int val;
}

class BinaryTreeFindMaximumSumPath {

	static Node root;
	static int recursivelyFindMaximumSumPathUtil(Node node, Res res) {
		if(node==null)
			return 0;
		
		int left = recursivelyFindMaximumSumPathUtil(node.left, res);
		int right = recursivelyFindMaximumSumPathUtil(node.right, res);
		
		int max_single = Math.max(Math.max(left,right)+node.data, node.data);
		
		int max_top = Math.max(max_single, left+right+node.data);
		
		res.val = Math.max(res.val, max_top);
	
		return max_single;
	}
	
	int findMaximumSumPath(Node node) {
		
		Res res = new Res();
		res.val = Integer.MIN_VALUE;
		recursivelyFindMaximumSumPathUtil(node, res);
		return res.val;
		
	}
	int findMaximumSumPath() {
		return findMaximumSumPath(root);
	}

	public static void main(String[] args) {
		BinaryTreeFindMaximumSumPath tree = new BinaryTreeFindMaximumSumPath();
		tree.root = new Node(0);
		tree.root.left = new Node(19);
		tree.root.right = new Node(10);
		tree.root.left.left = new Node(12);
		tree.root.right.right = new Node(9);
		tree.root.right.left = new Node(4);
		tree.root.left.right = new Node(-8);
		System.out.println("The maximum sum path for: 0 L19 R10 RLL12 RRR9 RRL4 RLR-8 is " + tree.findMaximumSumPath());

	}

}

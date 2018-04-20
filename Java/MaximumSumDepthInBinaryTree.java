import java.util.*;
import java.lang.*;

class Node {
		
	int data = 0;
	Node left, right;
	public Node(int num) {
		this.data = num;
		left = right = null;
	}
}

class Res {
	int res;
}


public class MaximumSumDepthInBinaryTree {

	static Node root;
	
	public int findPathWithLargestSumUtil(Node root, Res sum) {
		
		if(root == null) 
			return 0;
		int maxSumLeft = findPathWithLargestSumUtil(root.left, sum);
		int maxSumRight = findPathWithLargestSumUtil(root.right, sum);
		
		int maxSum = Math.max(Math.max(maxSumLeft, maxSumRight) + root.data, root.data);
		
		int maxTop = Math.max(maxSum, root.data + maxSumLeft + maxSumRight);
		
		sum.res = Math.max(maxTop, sum.res);
		return maxSum;
	}
	
	int findPathWithLargestSum() {
		return findPathWithLargestSum(root);
	}

	int findPathWithLargestSum(Node node) {
		Res sum = new Res();
		sum.res = Integer.MIN_VALUE;
		findPathWithLargestSumUtil(node, sum);
		return sum.res;
	}
	
	public static void main(String[] args) {
		MaximumSumDepthInBinaryTree tree = new MaximumSumDepthInBinaryTree();
		
		tree.root = new Node(2);
		tree.root.left = new Node(3);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(2);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(10);
		tree.root.left.left.left = new Node(1);
		tree.root.left.left.right = new Node(3);
		tree.root.right.right.left = new Node(20);
		            //            2
                    //           3    9
                    //         4 	2 6  10
					//		1 3      20
		
		System.out.println("max path sum is: " + tree.findPathWithLargestSum());
	}


}
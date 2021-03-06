/*Description: Given a tree find the given sum if in the root in the list.
Author: April Randolph
Date: 04/09/20 */

class Node {
	int value;
	Node left;
	Node right;
	Node(int value) {
		this.value = value;
		right = left = null;
	}
}

class TreePathSum {

	static Node root;

	static boolean findSumOfK(Node curHead, int sum) {
		if(curHead == null) {
			return false;
		}
		while(curHead != null) {
			if(sum!= curHead.value && curHead.left==null && curHead.right==null) {
				return false;
			}
			if(curHead.value==sum)
				return true;
			return findSumOfK(curHead.left, sum-curHead.left.value) || findSumOfK(curHead.right, sum-curHead.right.value);
			
		}
		return false;
	}

	static void printTreeNodesPostOrder(Node head) {
		if(head==null) {
			return;
		}
		printTreeNodesPostOrder(head.left);
		System.out.print("   ");
		printTreeNodesPostOrder(head.right);
		System.out.print("  ");
		System.out.print(head.value + " ");
		System.out.print("\n");
	}
	
	public static void main(String[] args) {

		root = new Node(3);
		root.left = new Node(1);
		root.right = new Node(5);
		root.right.left = new Node(3);
		root.right.right = new Node(11);
		root.left.left = new Node(3);
		root.left.right = new Node(2);
		printTreeNodesPostOrder(root);
		int sum = 10;
		System.out.println("The sum in the tree to find is: " + sum);
		System.out.println(findSumOfK(root, sum));
	}
}

public class BalancedBinarySearchTree {

	static Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static void balancedBinarySearchTree(int[] arr, int n) {
		int middle = n/2;
		
		for(int i = 0;i<n;i++) {
			insert(arr[i]);
		}
	}
	
	static void insert(int assignedValue) {
		Node newNode = new Node(assignedValue);
		if(root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true) {
			parent = current;
			if(assignedValue<current.data) {
				current = current.left;
				if(current==null) {
					parent.left = newNode;
					return;
				}
			}else {
				current = current.right;
				if(current==null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	static void print(Node head) {
		if(head == null) {
			return; 
		}
		print(head.left); 
		System.out.println(head.data + " ");
		print(head.right);		
	}
	
	public static void main(String[] args) {
		int[] numbersArrayUnsorted = {1, 2, 4, 6, 7, 9};
		int n = numbersArrayUnsorted.length;
		balancedBinarySearchTree(numbersArrayUnsorted, n);
		print(root);
	}

}

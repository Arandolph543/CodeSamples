class Node {
	
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
public class MinimumDepthBinaryTree {

	Node root; 
	
	int findMinimumDepth() {
		return findMinimumDepth(root);
	}
	
	int findMinimumDepth(Node root) {
		
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return 1;
		
		if(root.right != null) {
			return findMinimumDepth(root.left) + 1;
		}
		
		if(root.left != null) {
			return findMinimumDepth(root.right) + 1;
		}
		
		return Math.min(findMinimumDepth(root.right), findMinimumDepth(root.left)) + 1;
	}

	public static void main(String[] args) {
		MinimumDepthBinaryTree tree = new MinimumDepthBinaryTree();
		tree.root = new Node(3);
		tree.root.left = new Node(3);
		tree.root.right = new Node(8);
		tree.root.left.left = new Node(2);
		tree.root.right.left = new Node(0);
		tree.root.right.left.right = new Node(9);
		System.out.println(tree.findMinimumDepth());
	}
}


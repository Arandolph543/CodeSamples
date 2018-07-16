class Node {

	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}

public class ReverseLinkedListOfK {

	static Node root;
	
	static Node reverseGroupLinkedList(Node head, int k) {
		if(head == null || head.next == null)
			return head;
		if(k == 1) 
			return head;

		Node current = head;
		Node previous = null;
		int x = 1;
		while(current != null && x <= k) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			System.out.println("Debug: " + current.data);
			x++;
		}
		head.next = reverseGroupLinkedList(current, k);
		return head;
	}

	public static void main(String[] args) {
		root = new Node(4);
		root.next = new Node(3);
		root.next.next = new Node(0);
		root.next.next.next = new Node(11);
		Node reversedNode = reverseGroupLinkedList(root, 3);
		/*while(root != null) {
			System.out.print(reversedNode.data + " ");
		}*/
	}
}

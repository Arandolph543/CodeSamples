class Node {

	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}

public class ReverseLinkedList {

	static Node head;
	
	static Node reverseList(Node root) {
		Node previous = null;
		Node next = null;
		Node current = root;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;	
			current = next;
		}
		
		return previous;
		
	}
	
	static void printList(Node list) {
		while(list != null) {
			System.out.println(list.data);
			list = list.next;
		}		
	}

	public static void main(String[] args) {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		printList(reverseList(head));		
	}
}

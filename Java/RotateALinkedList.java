class Node {
	
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}	
}

public class RotateALinkedList {
	static Node head;

	static Node rotateALinkedList(Node head, int k) {
		Node newHead;
		Node next;
		Node previous;
		Node current = head;
		int count = 0;
		if(head != null) 
			count = 1;
		while(current != null) {
			current = current.next;
			count++;
			if(count == k) {
				break;
			}	
		}
		newHead = current.next;
		current.next = null;
		next = newHead;
		while(next.next != null) {
			next = next.next;			
		}
		next.next = head;
		return newHead;
	}

	public static void main(String[] args) {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		int k = 3;
		Node rotated = rotateALinkedList(head, k);
		while(rotated != null) {
			System.out.println(rotated.data);
			rotated = rotated.next;			
		}
	}
}

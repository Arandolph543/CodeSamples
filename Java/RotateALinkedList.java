/*Description: Rotate a linked list and return the list from the head node. 
Author: April Randolph
Date: 03/10/21*/

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
		//Base case: if node is null
		if(head != null) 
			count = 1;
		//get the list count
		while(current != null) {
			current = current.next;
			count++;
			if(count == k) {
				break;
			}	
		}
		//set the head to next setting iterated node to null
		newHead = current.next;
		current.next = null;
		//go back through the enter list setting the new head node
		next = newHead;
		while(next.next != null) {
			next = next.next;			
		}
		next.next = head;
		//return the same list rotated new head
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

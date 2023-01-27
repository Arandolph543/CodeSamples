/*Description: The linked list of integers is created given the linked list values and then calls to remove duplicates in linkedlist.
Author: April Randolph
Date:08/22/20*/
class LinkedList {
	static Node head;

	static class Node {
		int data;	
		Node next, previous;
		Node(int data) {
			this.data = data;
			next = null;
			previous = null;
		}
	}

	public void removeDuplicates() {
		Node dup = null, ptr1 = null, ptr = null;
		ptr1 = head;
		while(ptr1 != null && ptr1.next != null) {
			ptr = ptr1;
			while(ptr.next != null) {
				if(ptr1.data == ptr.next.data) {
					dup = ptr.next;
					ptr.next = ptr.next.next;
					System.gc();				
				} else {
					ptr = ptr.next;
				}	
			}
			ptr1 = ptr1.next;				
		}
	}

	void printList(Node node) {
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.print("\n ");
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(3);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(1);
		list.head.next.next.next.next = new Node(2);
		list.printList(head);
		list.removeDuplicates();
		list.printList(head);
	}
}

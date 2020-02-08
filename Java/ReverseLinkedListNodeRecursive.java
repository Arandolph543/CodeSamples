import java.lang.*;
import java.util.*;

class ReverseLinkedListNodeRecursive {

	static Node head;

	static class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
		}
	}
	
	static Node reverseList(Node cur, Node prev) {
		if(cur.next==null) {
			head = cur;
			cur.next = prev;
			
			return head;
		}
		
		Node temp = cur.next;
		cur.next = prev;
		reverseList(temp, cur);
		
		return head;
	}
	
	static void printLinkedList(Node node) {
		while(node!=null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedListNode nodesList = new ReverseLinkedListNode();
		nodesList.head = new Node(3);
		nodesList.head.next = new Node(8);
		nodesList.head.next.next = new Node(2);
		nodesList.head.next.next.next = new Node(4);
		nodesList.head.next.next.next.next = new Node(3);
		nodesList.head.next.next.next.next.next = new Node(1);
		nodesList.printLinkedList(head);
		Node reversedListHead = reverseList(head, null);
		nodesList.printLinkedList(reversedListHead);
	}

}

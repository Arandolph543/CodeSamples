/*Description: Reverse a linked list returning the head use recursion. 
Author: April Randolph
Date: 04/08/20 */

import java.lang.*;
import java.util.*;

 class Node {
	int value;
	Node next;
	Node(int value) {
		this.value = value;
	}
}

class ReverseLinkedListNodeRecursive {

	static Node head;
	
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
			System.out.print(node.value + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		head = new Node(3);
		head.next = new Node(8);
		head.next.next = new Node(2);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(3);
		head.next.next.next.next.next = new Node(1);
		printLinkedList(head);
		System.out.println("Revered this: \n");
		Node reversedListHead = reverseList(head, null);
		printLinkedList(reversedListHead);
	}

}

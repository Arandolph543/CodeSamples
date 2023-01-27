/* LinkedList merging. 
Author: April Randolph
Date: 06/01/20 */
import java.lang.*;
import java.util.*;

class Node {
	int value;
	Node next;		
	public Node(int value) {
		this.value = value;
	}
}
class MergeLinkedLists {

	static void mergedList(Node listHead, Node head) {
		if(listHead==null || head==null)
			return;
		Node newHead = listHead;
		System.out.print(listHead.value + " ");
		listHead = listHead.next;
		while(listHead!=null && head!=null) {
			if(head.next!=null || head!=null) {
				newHead.next = head;
				System.out.print(head.value + " ");
				head = head.next;				
			}
			if(listHead.next!=null || listHead!=null) {
				newHead.next = listHead;
				System.out.print(listHead.value + " ");
				listHead = listHead.next;
			}	
		}
		if(listHead!=null || head!=null) {
			if(listHead!=null) {
				newHead.next = listHead;
				System.out.print(listHead.value + " ");
			}
			if(head!=null) {
				newHead.next = head;
				System.out.print(head.value + " ");
			}
		}
	}

	public static void main(String[] args) {
		Node list = new Node(0);
		list = new Node(2);
		list.next = new Node(4);
		list.next.next = new Node(6);
		list.next.next.next = new Node(8);
		
		Node list2 = new Node(0);
		list2 = new Node(1);
		list2.next = new Node(3);
		list2.next.next = new Node(5);
		list2.next.next.next = new Node(7);
		mergedList(list2, list);
		
	}
}

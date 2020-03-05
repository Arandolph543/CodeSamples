/*Description: Find the intersecting link in a Y shaped LinkedList of integers. 
Author: April Randolph
Date: 03/05/20*/

import java.util.*;
import java.lang.*;
import java.io.*;

class IntersectingLinkedListYShaped {

	static Node root;

	static class Node {
		int data;
		Node next;
		Node(int number) {
			this.data = number;			
		}
	}

	static Node findIntersectingNodeInYShapedLinkedList(Node list, Node node, int k) {
		int index = 0;
		Node foundNode = list;
		while(list.next!=null){
			System.out.println(list.data);
			index++;
			if(list.data==k) {
				System.out.println("The intersect is as the " + index + " from the start of list 1 ");
				foundNode = list;
				return list;
			}
			list = list.next;
			node = node.next;
		}
		return foundNode;
	}


	public static void main(String[] args) {
		Node node = new Node(3);
		root = new Node(7);
		root.next = new Node(0);
		root.next.next = new Node(290);
		root.next.next.next = new Node(4);
		node.next = new Node(7);
		node.next = root.next.next.next;
		node.next.next = new Node(3);
		Node newNode = findIntersectingNodeInYShapedLinkedList(root, node, 4);
		System.out.println("The node that is connected: " + newNode.data);
	}

}

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
		try {
			BufferedReader inputStringReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the two lists of Nodes of numbers press enter after the first list is entered with 6 element and 3 elements.");
			String str1 = inputStringReader.readLine();
			String str2 = inputStringReader.readLine();
			int len = str1.length();
			int[] arrayNodeIntegersList = new int[len];
			int[] arrayNodeIntegersList1 = new int[len];
			int index = 0;
			for(int i = 0;i<str1.length();i++) 
				arrayNodeIntegersList[i] = Integer.parseInt(String.valueOf(str1.charAt(i)));
			for(int i = 0;i<str2.length();i++) 
				arrayNodeIntegersList1[i] = Integer.parseInt(String.valueOf(str2.charAt(i)));
			Node node = new Node(arrayNodeIntegersList1[0]);
			for(Integer val : arrayNodeIntegersList) {
				int tempInd = index;
				Node tempNode = root;
				if(arrayNodeIntegersList1[tempInd]!=val && index==tempInd && index<3) {
					root = new Node(val);
					tempNode = root;
					tempInd++;
				} else if(arrayNodeIntegersList1[tempInd]!=val && index==tempInd && index<3) {
					root.next = new Node(val);
					tempNode = root;
					tempInd++;
				} else if(arrayNodeIntegersList1[tempInd]!=val && index==tempInd && index<3) {
					root.next.next = new Node(val);
					tempNode = root;
					tempInd++;
				} else if(arrayNodeIntegersList1[index]!=val && index==tempInd && index<3) {
					root.next.next.next = new Node(val);
					tempNode = root;
					tempInd++;
				} else {
					index++;
					node.next = tempNode;
				}
			}
			while(index<3) {
				if(index==0)
					node.next = new Node(arrayNodeIntegersList1[1]);
				if(index==1)
					node.next = new Node(arrayNodeIntegersList1[0]);
				if(index==2)
					node.next.next = new Node(arrayNodeIntegersList1[2]);
				index++;
					
			}
				Node newNode = findIntersectingNodeInYShapedLinkedList(root, node, 4);
			System.out.println("The node that is connected: " + newNode.data);
		} catch(IOException ex){
			System.out.println(ex);
		}
		
	}

}

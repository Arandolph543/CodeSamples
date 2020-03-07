/* Description: LinkedList as a given number adding two lists.  
Author: April Randolph
Date: 07/28/18,10/19/2019 */

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}

class AddNumbersInLinkedList {
	
	static int addLists(Node list1, Node list2) {
		int res = 0;
		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();
		while(list1 != null) {
			num1.append(list1.data);
			list1 = list1.next;
		}
		while(list2 != null) {
			num2.append(list2.data);
			list2 = list2.next;			
		}
		res = Integer.valueOf(num1.toString()) + Integer.valueOf(num2.toString());
				
		return res;
	}

	public static void main(String[] arg) {
		Node variableConstant1 = new Node(1);
		variableConstant1.next = new Node(9);
		variableConstant1.next.next = new Node(3);
		variableConstant1.next.next.next = new Node(1);
		
		Node variableConstant2 = new Node(2);
		variableConstant2.next = new Node(7);
		variableConstant2.next.next = new Node(3);
		
		System.out.println(addLists(variableConstant1, variableConstant2));	
	}
}

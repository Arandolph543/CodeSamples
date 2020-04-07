/*Description: Partioned linkedlist around given value. 
Author: April Randolph
Date: 04/07/20*/

class ListNode {
	int val;
	ListNode next;
	ListNode(int data) {
		this.val = data;
	}
}

class PartionedLinkedListOfK {
	static ListNode root;

	public ListNode partitionAroundK(ListNode head, int x) {
        if(head == null) return null;
 
        ListNode fakeHead1 = new ListNode(0);
        ListNode fakeHead2 = new ListNode(0);
        fakeHead1.next = head;
 
        ListNode lower = head;
        ListNode prev = fakeHead1;
        ListNode upper = fakeHead2;
 
        while(lower != null) {
            if(lower.val < x) {
                lower = lower.next;
                prev = prev.next;
            } else {
 
                upper.next = lower;
                prev.next = lower.next;
 
                lower = prev.next;
                upper = upper.next;
            } 
        }
        upper.next = null;
 
        prev.next = fakeHead2.next;
 
        return fakeHead1.next;
    }
	
	public void print(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}		
	}
	
	public static void main(String[] args) {
		PartionedLinkedListOfK listOfLinks = new PartionedLinkedListOfK();
		root = new ListNode(3);
		root.next = new ListNode(5);
		root.next.next = new ListNode(8);
		root.next.next.next = new ListNode(5);
		root.next.next.next.next = new ListNode(10);
		root.next.next.next.next.next = new ListNode(2);
		root.next.next.next.next.next.next = new ListNode(1);
		System.out.print("The original list given is: ");
		listOfLinks.print(root);
		root = listOfLinks.partitionAroundK(root, 5);
		listOfLinks.print(root);
	}
}

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
	
	void remove_duplicates() {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
	
	public void removeDuplicates() {
		Node dup, next, ptr = null;
		next = head;
		System.out.println("next " + next.next.data);
		while(next != null && next.next != null) {
			ptr = next;
			while(ptr.next != null) {
			System.out.println("ptr has next " + ptr.next.next + " " + ptr.data);
				if(ptr.data == ptr.next.data) {
					dup = ptr.next;
					System.out.println("Debug: " + dup.next.next.data );
					ptr.next = ptr.next.next;
					System.gc();				
				} else {
					System.out.println(" " + ptr.next.data + " " + ptr.data);
					ptr = ptr.next;
				}	
			}
			next = next.next;				
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
		list.remove_duplicates();
		list.printList(head);
		
	
	}
}

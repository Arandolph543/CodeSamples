/*Description: A list Node is used to merge two lists as an API endpoint method call.
Author:April Randolph
Date:08/22/20 */

public class ListNode {

	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

class ListsMerge  {
 
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode h = new ListNode(0);
		ListNode list = h;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				h.next = l1;
				h = h.next;
				l1 = l1.next;
			} else {
				h.next = l2;
				h = h.next;
				l2 = l2.next;
			}
		}
		if(l1==null) {
			h.next=l2;
		}
		if(l2==null{
			h.next=l1;
		}
		return list.next;
	}
	
	public static ListNode mergeKLists(ListNode[] list) {
		if(list.length==0)
			return null;
		int interval = 1;
		while(interval < list.length){
			for(int i =0;i+interval<list.length;i+interval*2) {
				lists[i]=mergeTwoLists(lists[i], lists[i+interval]);
			}
			interval*=2;
		}
		return lists[0];
	}
 }
 

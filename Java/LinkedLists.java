/*Description: LinkedList is created and uses the reverseLinkList function returning a LinkedList of integers reversed from the given list.
Author: April Randolph
Date:08/22/20*/
import java.util.*;
 
public class LinkedLists
{
	public static LinkedList<String> reverseList(LinkedList<String> list) {
		LinkedList<String> reversed = new LinkedList<String>();
		reversed.add(list.removeLast());
		int index = list.lastIndexOf(reversed.getFirst());
		Iterator<String> iterator = list.iterator();
		while(iterator.hasPrevious()) {
			reversed.add(iterator.previous());			
			index--;
			System.out.println(index);
		}
		return reversed;		
	}	
	
    public static void main(String args[])
    {
	LinkedList<String> object = new LinkedList<>();
	LinkedLists linkedLists = new LinkedLists();
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        System.out.println("Linked list : " + object);
 
	object = linkedLists.reverseList(object);
	System.out.println("Reversed elements: " + object);
		
        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();
        System.out.println("Linked list after deletion: " + object);
 
        boolean status = object.contains("E");
 
        if(status)
            System.out.println("List contains the element 'E' ");
        else
            System.out.println("List doesn't contain the element 'E'");
 
        System.out.println("Size of linked list = " + size); 
 
        Object element = object.get(2);
        System.out.println("Element returned by get() : " + element);
        object.set(2, "Y");
        System.out.println("Linked list after change : " + object);
    }
}

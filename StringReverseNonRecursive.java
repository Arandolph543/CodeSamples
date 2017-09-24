import java.lang.*;
import java.util.*;

class ReverseString {
	
	public static void main(String args[]) {
		Object[] item = new Object[1];
		item[0] = "please reverse me!";
		Collection.reverse(item[0].toString());
		ListIterator iter = item.listIterator();
		while(iter.hasNext()) {
			System.out.println("Reversed : " + iter.next());
		}
	}
}	

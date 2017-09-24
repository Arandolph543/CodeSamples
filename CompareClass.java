import java.lang.*;
import java.util.*;

public class CompareClass extends BinaryComparator { 


	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(0);
		list.add(1);
		System.out.println(list);
		Comparator<Integer> comparator = new BinaryComparator();
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}

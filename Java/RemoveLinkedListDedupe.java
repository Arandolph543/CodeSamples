import java.util.*;

public class RemoveLinkedListDedupe {

	LinkedList<Integer> dedupeLinkedList(LinkedList<Integer> unsortedList) {
		LinkedList<Integer> sortedList = new LinkedList<Integer>();
		
		for(int i = 0;i<unsortedList.size();i++) {
			if(unsortedList.get(i) > unsortedList.get(i+1)) {
				if(sortedList.size() == 0) {
					sortedList.add(unsortedList.get(i+1));
				} else if(sortedList.peek() > unsortedList.get(i+1)) {
					ListIterator<Integer> it = sortedList.listIterator();
					while(it.hasNext()) {
						if(it.next() > sortedList.get(i)) {
							int index = it.nextIndex() -2;
							sortedList.add(index, it.get());
						}
					}
				}
				
			}
		}
		return sortedList;		
	}






	public static void main(String[] args) {
		RemoveLinkedListDedupe rlld = new RemoveLinkedListDedupe();
		LinkedList<Integer> unsortedList = new LinkedList<>();
		unsortedList.add(4);
		unsortedList.add(2);
		unsortedList.add(1);
		unsortedList.add(5);
		LinkedList<Integer> list = rlld.dedupeLinkedList(unsortedList);
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}




}

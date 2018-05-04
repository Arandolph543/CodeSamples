import java.util.*;

public class RemoveLinkedListDedupe {

	LinkedList<Integer> dedupeLinkedList(LinkedList<Integer> sortedList) {
		Collections.sort(sortedList);
		ListIterator iterator = sortedList.listIterator();
		Integer itemListNumber = 0;
		int index = 0;
		int length = sortedList.size() -1;
		while(iterator.hasNext() && index < length) {
			int tempIndex = iterator.nextIndex() + 1;
			if(iterator.next().equals(sortedList.get(tempIndex))) {
			System.out.println(iterator.next() + " " + sortedList.get(tempIndex));
				iterator.remove();
			}
			index++;
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
			System.out.print(listIterator.next() + " ");
		}
	}

}

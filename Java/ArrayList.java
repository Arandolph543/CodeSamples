/*Description: Create an ArrayList class without using the java ArrayList with the same functions. 
Author: April Randolph
Date: 03/06/20*/

import java.lang.*;
import java.util.Arrays;

public class ArrayList {

	private Object[] arrayList;
	private static int arraySize;
	
	public ArrayList() {
		arrayList = new Object[8];
	}
		
	public void add(Object number) {

		if(arrayList.length - getSize() <= 5) {
			increaseArrayCountSize();
		}
		arrayList[arraySize++] = number;
	}
	
	public void remove(Object m) {
		for(int l = 0;l<getSize();l++) {
			if(m == get(l)) {
				arrayList[l] = arrayList[l+1];
				for(int d = l+1;d<getSize();d++) {
					arrayList[d] = arrayList[d+1];
				}
			}
		}
	}
	
	public Object get(int index) {
		if(index < getSize()) {
			return arrayList[index];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	static int getSize() {
		return arraySize;		
	}
	
	private void increaseArrayCountSize() {
		arrayList = Arrays.copyOf(arrayList, arrayList.length*2);
	}

	public static void main(String[] args) {
		ArrayList listArray = new ArrayList();
		listArray.add(new Integer(2));
		System.out.println(listArray.get(0));
		listArray.remove(listArray.arrayList);
		listArray.add(new Integer(51));
		if(listArray != null) {
			for(int i = 0;i<listArray.getSize();i++) {
				System.out.println(listArray.get(i));
			}
		}
	}

}

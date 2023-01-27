/*Description: Create the search to find the element that appears only once in the array Divide and Conquer
Author: April Randolph
Date: 02/16/20*/
import java.util.*;
import java.io.*;
import java.lang.*;

class FindElementThatAppearsOnceSortedArray {



	static int findElementAppearsOnce(int[] array, int len) {
		HashMap<Integer, Integer> countsMap = new HashMap<>();
		int index = 0;
		for(int i = 0;i<len;i++) {
			if(!countsMap.containsKey(array[i])){
				countsMap.put(array[i], countsMap.getOrDefault(array[i], 0)+1);
			} else if(countsMap.containsKey(array[i])) {
				countsMap.replace(array[i], countsMap.get(array[i])+1);
			}
		}
		Iterator iter = countsMap.entrySet().iterator();
		if(countsMap.size()>0) {
			while(iter.hasNext()) {
				Map.Entry pair = (Map.Entry)iter.next();
				if(Integer.parseInt(pair.getValue().toString())==1){
					index = Integer.parseInt(String.valueOf(pair.getKey()));
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int number = Integer.parseInt(buffer.readLine());
			while(number>0) {
				String inputStr1 = buffer.readLine();
				int len = Integer.parseInt(inputStr1.toString());
				String array = buffer.readLine();
				int[] inputs = new int[len];
				for(int i =0;i<len;i++) {
					inputs[i] = Integer.parseInt(String.valueOf(array.charAt(i)));
				}
				int commonSubCount = findElementAppearsOnce(inputs, len);
				System.out.println("For the inputs: " + inputStr1 + " there's " + commonSubCount);
				number--;				
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}




}

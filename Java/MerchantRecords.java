/*Description: Given records format challenge Hired Assessment. 
Author: April Randolph
Date: 02/27/20*/

import java.util.*;
import java.lang.*;

class MerchantRecords {

	static String fileRecords(String[] records) {
		int len = records.length;
		Map<String, Integer> runningTotalsMap = new HashMap<String, Integer>();
		Map<String, Integer> orderSetMap = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		int index = -1;
		for(int i = 0;i<len;i++) {
			String recEntryNameString = records[i];
			String[] record = recEntryNameString.split("\\|");
			String storeName = record[1] + "|" + record[2];
			if(storeName.contains("Pizza") {
				orderSetMap.put(storeName, index++);
				Integer value = new Integer(record[3]);
				if(value>0) {
					if(!runningTotalsMap.containsKey(storeName)) {
						runningTotalsMap.put(storeName, 0);
					}
					if(value>0)
						runningTotalsMap.put(storeName, value + runningTotalsMap.get(storeName));	
				}
			}
		}
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(orderSetMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		
		for(String s : temp.keySet()) {
			String entryRecordMerchant = s + "|" + runningTotalsMap.get(s) + ",";
			sb.append(entryRecordMerchant);
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}

	public static void main(String[] args) {
		String[] inputsRecords = {"100|Pete's Pizza Palace|George Smith|100","101|Pete's Pizza Palace|George Smith|23","102|Pete's Pizza Palace|George Smith|-13", "329|Pete's Pizza Palace|John Smith|48", "179|Pete's Pizza Palace|Jane Smith|4169"};	
		System.out.println(fileRecords(inputsRecords));
	}
}

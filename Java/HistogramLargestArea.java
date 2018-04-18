import java.lang.*;
import java.util.*;
import java.io.*;

public class HistogramLargestArea {

	public static BufferedReader buffer;
	public static HashMap<Integer, HashMap<Integer,String>> inputMap;
 
	public int[] areaInHistogram() {
		int[] greatestArea = new int[inputMap.get(0).size()];
		int[] heightArray = null;
		List<String> values = new ArrayList<String>();

		//Creating array from input
		int mid = 0;
		for(int l =0;l< inputMap.get(0).size();l++) {
			HashMap<Integer,String> histogramMap = inputMap.get(l);
			Iterator histogramEntries = histogramMap.entrySet().iterator();
			while(histogramEntries.hasNext()) {
				Map.Entry thisEntry = (Map.Entry) histogramEntries.next();
				Object value = thisEntry.getValue();
				values.add((String)value);
			}
			for(String value : values) {
				String[] hist = value.split(" ");
				heightArray = new int[hist.length];
				for(int i = 0;i< hist.length;i++) {
					heightArray[i] = Integer.parseInt(hist[i]);
				}
			}
			if(heightArray.length % 2 == 0) {
				mid = heightArray.length/2;
			}else {
				mid = (heightArray.length/2) + 1;
			}
			
			greatestArea[l] = findGreatestHistArea(heightArray, 0, heightArray.length-1);
		}
		return greatestArea;
	}

	public int findGreatestHistArea(int[] heights, int i, int m) {
		Stack<Integer> left = new Stack<>();
		int index = i;
		int histArea = 0;
		int maxHistArea = 0;
		int tp = 0;
		while(index < m) {
			System.out.println(index);
			if(left.empty() || heights[left.peek() - 1] <= heights[index]) {
				left.push(heights[index++]);
			} else {
				tp = left.peek();
				left.pop();
				histArea = heights[tp-1] * (left.empty() ? index : index - left.peek() -1);
				if(maxHistArea < histArea) {
					maxHistArea = histArea;
				}
			}
		}
		while(!left.empty()) {
			tp = left.peek();
			left.pop();
			histArea = heights[tp-1] * (left.empty() ? index : index - left.peek() -1);
			if(maxHistArea < histArea) {
				maxHistArea = histArea;
			}
		}
		return maxHistArea;
	}
	
	public static void main(String[] args) {
		HistogramLargestArea greatestAreaClass = new HistogramLargestArea();
		System.out.println("Please enter number of cases to be tested?");
		buffer = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		try {
			count = Integer.valueOf(buffer.readLine());
		} catch(IOException ex) {
			System.out.println(ex.toString());
		}
		if(count >= 1) {
			inputMap = createTests(count);
		}
		int[] areas = new int[count];
		areas = greatestAreaClass.areaInHistogram();
		for(int i = 0;i<areas.length;i++) {
			System.out.println("The area in the histrogram is : " + areas[i]);
		}
	}

	public static HashMap<Integer, HashMap<Integer,String>> createTests(int count) {
		int index = 0;
		int heightsCount = 0;
		String heights  = "";
		HashMap<Integer,String> histogramMaps = new HashMap<>();
		inputMap = new HashMap<Integer, HashMap<Integer,String>>();
		try {
			while(count > 0&& buffer.readLine() != null) {
				System.out.println("Please enter how many heights?");
				heightsCount = Integer.valueOf(buffer.readLine());
				System.out.println("Please enter number inputs of heights?");
				heights = buffer.readLine();
				histogramMaps.put(heightsCount, heights);
				inputMap.put(index, histogramMaps);
				//System.out.println("Debug: count" + count);
				count--;
			}
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}
		return inputMap;
	}


	
}

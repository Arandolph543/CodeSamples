/*Description: Given arrays denoting the bars heights find the water that is trapped. 
Author: April Randolph
Date: 02/12/20*/
import java.util.*;
import java.lang.*;
import java.io.*;

class WaterTrappedByRain {

	static int findTrappedRainWater(int[] barArr, int length) {
		int trapped = 0;
		if(length==0)
			return 0;
		int low = barArr[0];
		int high = 0;
		int base = 0;
		int[] mins = new int[length];
		int index = 0;
		int[] placeHolder = new int[2];
		placeHolder[0] = 0;
		for(int i =1;i<length;i++) {
			if(barArr[i]>high)
				high = barArr[i];
				placeHolder[1] = i;
			if(barArr[i]>low && barArr[i]<high)
				low = barArr[i];
				if(placeHolder[1]!=i)
					placeHolder[0] = i;
			if(barArr[i]<base)
				base = barArr[i];
			if(barArr[i]<low || barArr[i]<high)
				mins[index] = barArr[i];
				index++;
			if(low > 0 && high > 0) {
				int multiple = 0;
				int temp = 0;
				if(low < high)
					multiple = low;
				else if(high < low)
					multiple = high;
				if(base==0) {
					temp = multiple * ((placeHolder[1]-1) - (placeHolder[0] - 1));
				} else {
					int lowest = multiple - base;
					temp = (lowest * multiple) * ((placeHolder[1]-1) - (placeHolder[0] - 1));
				}
				for(int k = 0;k<mins.length;k++) 
					multiple = temp - mins[k];
				if(multiple>trapped)
					trapped = multiple;
			}
		}

		return trapped;
	}

	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int number = Integer.parseInt(buffer.readLine());
			while(number>0) {
				String inputStr1 = buffer.readLine();
				int len = inputStr1.length();
				int[] barsHeights = new int[len];
				for(int i =0;i<len;i++) {
					barsHeights[i] = Integer.parseInt(String.valueOf(inputStr1.charAt(i)));
				}
				int commonSubCount = findTrappedRainWater(barsHeights, len);
				System.out.println("For the inputs: " + inputStr1 + " there's " + commonSubCount);
				number--;				
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}

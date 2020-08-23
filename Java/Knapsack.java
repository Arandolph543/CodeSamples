/* Description: With two integer arrays and a given weight integer the value of possible weight is the integer returned called the Knapsack problem..
Author: April Randolph
Date: 08/22/20 */
public class Knapsack {

	static int getWeightValue(int[] values, int[] weights, int W) {
		int aggWeight = 0;
		int min = weights[0];
		int index = 0;
		int[] indexValues = new int[values.length];
		int minIndex = -1;
		for(int i = 0;i<weights.length;i++) {
			if(weights[i] < min || minIndex < 0) {
				min = weights[i];
				minIndex = i;
			}
			aggWeight += weights[i];
			if(aggWeight > W) {
				aggWeight = aggWeight - weights[minIndex];
				indexValues[minIndex] = -1;
			}
			if(aggWeight < W) {
				indexValues[i] = i;
				if((minIndex >= 0) && weights[i] > min) {
					min = weights[i];
				}
			} 
			if(aggWeight == W) {
				indexValues[i] = i;
				return getKnapSackValue(values, indexValues);
			} 
		}
		return getKnapSackValue(values, indexValues);	
	}
	
	static int getKnapSackValue(int[] values, int[] indices) {
		int ksValue = 0;
		for(int j = 0;j<indices.length;j++) {
			if(indices[j] > 0) {
				ksValue += values[indices[j]];
			}
		}
		return ksValue;
	}
	
	public static void main(String[] arg) {
		int[] values = {200,30,410,280};
		int[] weights = {35,40,100,20};
		int W = 140;
		System.out.println("weight: " + getWeightValue(values,weights, W));
	}
}

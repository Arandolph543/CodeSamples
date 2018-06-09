import java.lang.*;
import java.util.*;
import java.io.*;
public class ArrayMajorityElement {

	static int[] found;
	static final int NUMBERS = 10;
	
	static String findMajorityNumber(int[] numbers, int n) {
		int majority = 0;
		int m = found.length;
		for(int j = 0;j<n;j++) {
			for(int i = 0;i<m;i++) {
				if(i == numbers[j]) {
					found[i]++;
					if(found[i] > found[majority]) {
						majority = i;
					} 
						
				}
			}
		}
		if(found[majority]  > n/2) {
			return String.valueOf(majority);
		} else {
			return "NO Majority Element";
		}
	}

	public static void main(String[] args) {
		ArrayMajorityElement ame = new ArrayMajorityElement();
		BufferedReader stringBuffer; 
		found = new int[NUMBERS];
		int count = 0;
		try {
			String in;
			String[] inputNumbers = null;
			int size = 0;
			int[] numbers = null;
			stringBuffer = new BufferedReader(new InputStreamReader(System.in));
		
			if ((in = stringBuffer.readLine()) != null) {
				count = Integer.valueOf(in);
			}
			while(count > 0) {
				for(int i = 0;i<NUMBERS;i++) {
					found[i] = 0;
				}
				size = Integer.valueOf(stringBuffer.readLine());
				numbers = new int[size];
				inputNumbers = stringBuffer.readLine().split(" ");
				for(int k = 0;k<size;k++) {
					numbers[k] = Integer.valueOf(inputNumbers[k]);
				}
				System.out.println(findMajorityNumber(numbers, size));
				count--;
			}
		} catch (IOException e) {
			System.out.print("An " + e + " has occurred.");			
		}	
	}
}

/*Author: April Randolph
Date: 01/05/2015
Accepts a number from the user then sums the digits.
*/
import java.util.*;
import java.io.*;

public class SumOfTheNumber {
	
	public int numberSum(int[] num) {
		int sum = 0;

		for(int r = 1; r < num.length;r++) {
			sum = sum + num[r];
		} 

		return sum;		
	}

	
	public static void main(String[] arg) {
		SumOfTheNumber ns = new SumOfTheNumber();
		int totalNumberOfNumbers = 0;
		int added[] = null;
		int index = 0;
		try {
			int sum = 0;
			System.out.println("Please enter at least a two digit number.");
			Scanner in = new Scanner(System.in);
			totalNumberOfNumbers = Integer.parseInt(in.nextLine().trim());
			added = new int[totalNumberOfNumbers];
			while(totalNumberOfNumbers > 0) {
				added[index] = Integer.parseInt(in.nextLine().trim());
				totalNumberOfNumbers--;
				index++;
			}
			sum = ns.numberSum(added);
			System.out.println("The sum of " + sum);
		} catch (Exception e) {
			System.out.println("An Exception has occurred " + e.toString());
		}		
	}	
}

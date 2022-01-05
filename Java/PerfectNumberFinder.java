/* Description: The sum of the given integers positive divisors is determined with a string returned for if the number is a perfect number or isn't.
Author: April Randolph
Date: 01/05/22*/

import java.lang.*;

public class PerfectNumberFinder {

	public void isPerfectNumber(int numb) {
		int perNum = 0;
		//Find and sum the positive divisors
		for(int i = 1;i<=numb/2;i++) {
			if(numb%i == 0) {
				perNum += i;
			}		
		}
		//Check for perfect divisible sum to the input value meets condition		
		if(perNum==numb) {
			System.out.println("Your number is perfect number.");
		} else {
			System.out.println("Your number is not a perfect number.");
		}	
	}

	public static void main(String args[]) {
		PerfectNumberFinder perfNum = new PerfectNumberFinder();
		perfNum.isPerfectNumber(6);
	}
}

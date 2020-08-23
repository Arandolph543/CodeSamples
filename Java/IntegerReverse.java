/*Description: Reverses a number given as an integer.
Author: April Randolph
Date: 08/22/20*/
import java.util.*;

class NumberReverse {
	
	public int reverseInteger(int number) {
		int reverse = 0;
		
		while(number != 0) {
			reverse = (reverse*10) + (number%10);
			number = number/10;
		}
		return reverse;
	}
	
	public static void main(String args[]) {
		NumberReverse numRev = new NumberReverse();
		System.out.println("The number 45612 in reverse is " + numRev.reverseInteger(45612));
	}
}

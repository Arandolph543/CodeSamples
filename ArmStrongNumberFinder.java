/*Author: April Randolph
Date: 02/08/2015
Take any number as an input in the Console and determines if it
is a ArmStrong number, where the number added together and raised
to the power of the number of digits in the number equals itself.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArmStrongNumberFinder {
	
	static int sum;
	static int index;
		
	public int sumToThePower(int number) {
		sum = 0;
		index = String.valueOf(number).length();
		int temp = 0;
		int digit = number;
		boolean jump = true;
		while(jump) {
			temp = number%10;
			sum += Math.pow(temp, index);
			number = number/10;
			if(number < 1) {
				jump = false;
			}
		}
		return sum;
	}
		
	public boolean getArmStrongNumber(int number) {
		sum = sumToThePower(number);
		return (sum.equals(number));
	}
 
	public static void main(String[] args) {
		ArmStrongNumberFinder asnf = new ArmStrongNumberFinder();
		BufferedReader br = null;
		int num = 0;
		String in = "";
		System.out.println("Please input a number: ");
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			if((in = br.readLine()) != null) {
				num = Integer.valueOf(in.toString());
			}
		} catch(IOException e) {
			System.out.println("An Error has occurred " + e.toString());			
		} finally {
			try {
				if(br != null) {
					br.close();	
				}
			} catch (IOException ex) {
				System.out.println("An IOException has occurred " + ex.toString());	
			}
		}		
		System.out.println("The number " + in.toString() + ", is an ArmStrong Number is " + asnf.getArmStrongNumber(num));		
	}	
}

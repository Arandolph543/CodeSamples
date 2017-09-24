


/*Author: April Randolph
Date: 01/05/2015
Accepts a number from the user then sums the digits.
*/
import java.util.*;
import java.io.*;
import java.lang.*;

public class NumberSumByPlacements {
	static int sum;
	public static int getNumberSum(int number) {
		//******recursive method*******
		if(number != 0) {
			sum += number%10;		
			getNumberSum(number/10);
		} else {
			return sum;
		}
		/* *****non-recursive method *****/
		// int x = number;
		// for(int i=0; x > 0; i++) {
			// System.out.println(x = x/10);
			// sum += number%10;
		// }
		// return sum; 		
	}
	
	public static void main(String[] ar) {
		NumberSumByPlacement ns = new NumberSumByPlacement();
		ArrayList<String> inputs = new ArrayList<String>();
		try {
			String x;
			int added = 0;
			System.out.println("Please enter at least a two digit number.");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			if((x = br.readLine()) != null) {
				inputs.add(x.toString());
				// System.out.println("The number you entered was " + x.toString());
				// added = ns.getNumberSum(Integer.valueOf(x.toString()));
			}
			System.out.println("The sum of " + x.toString() + " is " + added);
		} catch (IOException e) {
			System.out.println("An IoException has occurred " + e.toString());
		} catch (Exception e) {
			System.out.println("An Exception has occurred " + e.toString());
		}		
	}	
}

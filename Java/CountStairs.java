/* Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
steps at a time. Implement a method to count how many possible ways the child can run up the
stairs.
*/

import java.util.*;
import java.io.*; 

public class CountStairs {
	public static int countWays(int n) {
	  	if (n < 0) {
 	  	 	return 0;
 	  	} else if (n == 0) {
 	  	 	return 1;
 	  	} else {
           		return countWays(n-1) + countWays(n-2) + countWays(n-3);
	  	}
  	} 

        public static void main(String[] args) {
		try {
			System.out.println("Please enter the number of stairs to climb up to: ");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String inputString = buffer.readLine(); 
			int inputN = Integer.parseInt(inputString);
			System.out.println("A child can run up the " + inputN + " " + countWays(inputN) + " ways."); } catch(IOException ex) {
		System.out.println(ex);
		}
        }
}

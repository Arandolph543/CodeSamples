/* Author April Randolph
* 
Equation: Requirement statement
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 Date: 03/11/2016
*/

import java.util.*;
import java.lang.*;

public class SimpleNumberBlocks {
	
	//Method to decide if it's a good day to sleep in.
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if(!weekday && !vacation) {
			return true;
		} else if(weekday && !vacation) {
			return false;
		} else if(!weekday && vacation) {
			return true;
		}		
	}	
	
	public boolean makeBricks(int small, int big, int goal) {
		
	}
	
	public static void main(String[] args) {
		SimpleNumberBlocks calculate = new SimpleNumberBlocks();
		String choice = calculate.menu();
		
		switch(choice) {
			//This is a user question of what day they want to find out is a good day for vacation.
			case 1:
				try {	
					String next = "";
					String nextvaca = "";
					System.out.println("If the time for vaction is a good weekday enter true: ");
					BufferedReader br = new BufferedReader(new InputReader(system.in));
					if((next = br.readLine()) != null) {
						System.out.println("If the day is a vaction day enter true: ");
						if((nextvaca = br.readLine()) != null) {
							if(nextvaca) {
								System.out.println("The day you want to take for vacation is a good day to take.");
							} else {
								System.out.println("The day you want to take for vacation is a bad day to take.");	
							}
						}
					}
				} catch(IOException exception) {
					System.out.println(ex.toString());
				}
			//Brick creator telling whether with the given bricks if it's able to make
			case 2:
				try {
					
					
				} catch(IOException exceptionIO) {
					System.out.println(exceptionIO.toString());
				}
		}
	}
	
}
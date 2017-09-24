/*
Author: April Randolph
Description: 


*/


import java.lang.*;
import java.io.*;
import java.util.function.*;
import java.util.HashMap;

public class RobotsGophersCatchPosition {
	static Function<Integer, Integer> squared = x -> x * x;
	static Function<Integer, Integer> summed = x -> x + x;
	
	public static HashMap<Integer, Integer> findClosestHole(HashMap<Integer, Integer> startingPositions, HashMap<Integer, Integer> holes) {
		//determine distance to holes
		int[] lengthRunRobotDog = new int[holes.size()];
		int[] lengthRunGopher = new int[holes.size()];

		Function<Integer, Integer> subtract = z -> a - b;
		for(int position: startingPositions) {
			for(int holePosition: holes) {
					
				
			}
		}
		
		//get the time to catch
		
		//choose the closestHole
		
		
	}
	
	public static Integer findSideA(int sideX, int sideY) {
		int travelLength = 0;
		//side c[] - b[]
		travelLength = (sideY * sideY) - (sideX * sideX); 		
		return travelLength;
	}
	
	public static Integer findSideB(int sideX, int sideY) {
		int travelLength = 0;
		//side c[] - a[]
		travelLength = (sideX * sideX) - (sideY * sideY); 
		return travelLength;
	}
	
	public static Integer findSideC() {
		int travelLength = 0;
		//side a[] + b[]
		travelLength = (sideY * sideY) + (sideX * sideX); 
		return travelLength;
	}
	
	public static String findPositionOfGopher(HashMap<Integer, Integer> hole, HashMap<Integer, Double> speeds) {
		String gopherLocation = "";
		
		
		
		
		return gopherLocation;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> closestHole = new HashMap<>();
		HashMap<Integer, Integer> startingPostions = new HashMap<>();
		HashMap<Integer, Integer> gopherHoles = new HashMap<>();
		HashMap<Integer, Double> speeds = new HashMap<>();
		Scanner scan = null;
		int number = 0;
		int index = 0;
		int lineCount = 0;
		String in = "";
		System.out.println("This is the automated robot that'll gopher run and catch before they reach the hole.  Please input a number(Enter exit to exit): ");
		try {
			scan = new Scanner(System.in);
			while(scan.hasNext()) {
				in = scan.next();
				if(in.toString().equals("exit") || lineCount == 0) {
					break;
				}
				if(number < 2 && index < 2) {
					startingPostions.put(index, Integer.valueOf(in));
				} else if(index == 2) {
					speeds.put(lineCount, Double.valueOf(in));
					index = -1;
				} else if(number == 2) {
					lineCount = Integer.valueOf(in);
					number = 0;
				} else if(lineCount -1 != 0) {
					if(index % 2 == 0) {
						gopherHoles.put(0, Integer.valueOf(in));
					} else {
						gopherHoles.put(1, Integer.valueOf(in));
					}
				}
				index++;
				number++;
			}
			scan.close();
			closestHole = findClosestHole(startingPostions, gopherHoles);
			// findPositionOfGopher(startingPostions, gopherHoles, speeds);
		} catch(Exception e) {
			System.out.println("An Error has occurred " + e.toString());			
		} finally {
			try {
				if(scan != null) {
					scan.close();	
				}
			} catch (Exception ex) {
				System.out.println("An IOException has occurred " + ex.toString());	
			}
		}		
		System.out.println();		
	}	
	
}

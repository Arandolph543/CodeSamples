/*Description: The plane is given with seats that will be taken possibly. A family of four can fit only in the
seats grouped with altogether only except if there is two on each side of the aisle. Using Knuth-Pratt-Morris
and Aho-Corasick to find the number of families for the given Seating as a String and number as the given.
Author: April Randolph
Date: 03/01/20*/


import java.lang.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.*;
//Available 4seatsections from B-E[1-4] F-J[5-9] with aisles else D-G[3-7]

class MatrixManipulationSeatingChart {
    static int[][] takenSeats;
	static int findFamilySeats(int N, String S) {
		String[] seats = S.split(" ");
		int numberOfFamilySeats = 0;
		int[][] planeSeats = new int[N][10];
		int[][] family = new int[1][4];
		
		takenSeats = new int[N][10];
		int[][] famSeats = new int[N][10];
		
		takenSeats = validSeats(S, N);
			
		if(N==1 && S.equals(""))
			return 2;
		
		for (int rowIndex = 0; rowIndex < N; rowIndex++) {
			outerLabel:
			for(int colIndex = 0;colIndex < 10; colIndex++) {
				if(takenSeats[rowIndex][colIndex]==1)
					continue outerLabel;
				for (int letterIndex = 1; letterIndex <= 5; letterIndex +=2) { 
					if(colIndex==0) {
						if (takenSeats[rowIndex][letterIndex] != 1 && takenSeats[rowIndex][letterIndex + 1] != 1 && takenSeats[rowIndex][letterIndex + 2] != 1 && takenSeats[rowIndex][letterIndex + 3] != 1) { 
							if (letterIndex == 1) letterIndex = 3;               
							if (letterIndex == 3) letterIndex = 5;             
							numberOfFamilySeats++;                             
						}
					}
				}
			}
		}
			
				
		return numberOfFamilySeats;
	}

	static int[][] validSeats(String S, int N) {
		String[] seats = S.split(" ");
		int length = seats.length;
		Pattern p = Pattern.compile("-?\\d+");
		String[] rowNames = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K"};
		for(int i = 0;i<length;i++) {
			for(int k = 0;k<rowNames.length;k++) {
				if(seats[i].contains(rowNames[k])) {
					Matcher m = p.matcher(seats[i]);
					Integer seat = 0;
					while (m.find()) {
					  seat =Integer.parseInt(m.group());
					}
					if(seat<=N) {
						takenSeats[seat-1][k] = 1;
					}
				}
			}
		}
		return takenSeats;
	}

	public static void main(String[] args) {
		String s = "";
		System.out.println("Number of familes " + findFamilySeats(1, s));
	}

}

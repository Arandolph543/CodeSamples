import java.lang.*;
import java.util.*;
import java.io.*;

public class Fibinocci { 

	public static int[] Fibinocci(int count) {
		int[] figures = new int[count-1];
		int i = 2;
		figures[0] = 1;
		figures[1] = 1;
		while(i<count-1) {
			figures[i] = figures[i-1] + figures[i-2];
			i++;
		}
		return figures;	
	}

	public static void main(String a[]) throws IOException {
		System.out.println("Please enter to what place to calculate the Fibinocci sequence to");
		int number = 0;
		try {
			BufferedReader stringBuffer = new BufferedReader(new InputStreamReader(System.in));
			number = Integer.valueOf(stringBuffer.readLine());
			System.out.println("You entered: " + number);
		} catch (Exception e) {
			throw new IOException("An exception has occurred. The program will now exit.");
		}
		int[] sequence = new int[number];
		sequence = Fibinocci(number);
		System.out.print("The sequence to " + String.valueOf(number).toString() + " is ");
		for(int i = 0;i<sequence.length;i++) {
			System.out.print(String.valueOf(sequence[i]).toString() + " ");
		}	
	}
}

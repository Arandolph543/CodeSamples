
import java.util.*;
import java.lang.*;
import java.io.*;

class FindSumTriplets {
	public static void main (String[] args) {
		try {
    		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    		int inputs = Integer.parseInt(buffer.readLine());
    		if(inputs >=1) {
        		while(inputs>0) {
        		    int count = Integer.parseInt(buffer.readLine());
        		    String inArr = buffer.readLine();
        		    String[] arrayString = inArr.split(" ");
        		    int[] array = new int[arrayString.length];
        		    for(int l=0;l<array.length;l++) {
        		        array[l] = Integer.parseInt(arrayString[l]);
        		    }
        		    int sum = 0;
        		    int totalTriples = 0;
        		    for(int i = 0;i<array.length;i++) {
        		        sum = array[i];
        		        for(int j=0;j<array.length;j++) {
        		            if(array[j]!=sum){
        		                if(array[j]+array[j++]==sum) {
        		                    totalTriples++;
        		                }
        		            }
        		        }
        		    }
        		    System.out.println("The total triples " + inputs + " " + totalTriples);
        		}
				inputs--;
    		}
		} catch(IOException ex) {
		    System.out.println(ex);
		}
	}
}
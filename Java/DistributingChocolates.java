/*Description: Using the delta find the number of the most employees that can have the highest amount of chocolates given the number of chocolates that are distributed in 5, 2, 1 quantities at a time for three employees.
Author: April Randolph
Date: 03/06/20*/


import java.io.*;
import java.util.*;

public class DistributingChocolates {
    
    static int min;
    
    public static int distributeCholocalates(int[] chocolates) {
        int[][] results = new int[chocolates.length][3];
		for(int i = 0;i<chocolates.length;i++) {
			for(int j = 0;j<3;j++) {
				
				int delta = chocolates[i] - min + j;
				System.out.println("Delta: " + delta);
				results[i][j] = 0;
				if(delta >=5 && chocolates[i]% 5 == 0) {
					delta -= 5;
					results[i][j]++;
				} else if(delta>=2  && chocolates[i]% 2 == 0) {
					delta -= 2;
					results[i][j]++;
				} else if(delta>=1 && chocolates[i]% 1 == 0) {
					delta -=1;
					results[i][j]++;
				}
			}			
		}
		int finalresult = -1;
		for(int i=0;i<3;i++) {
			int subfinal = 0;
			for(int j= 0;j<chocolates.length;j++) {
				subfinal += results[j][i];
			}
			if(finalresult < 0 || finalresult > subfinal) {
				finalresult = subfinal;
			}
		}        
        return finalresult;
    }
     
    public static void main(String args[] ) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int distributions = 0;
        int[] operations = null;
        try { 
            distributions = Integer.parseInt(buffer.readLine());
            operations = new int[distributions];
            int index = 0;
            while(distributions > 0) {
                int numberOfEmployees = 0;
                int[] chocolates = null;
                String[] chocolateInputs = null;
                String input = "";
                numberOfEmployees = Integer.parseInt(buffer.readLine());
                input = buffer.readLine();
                chocolates = new int[numberOfEmployees];
                chocolateInputs = new String[numberOfEmployees];
                chocolateInputs = input.trim().split("\\s+");
                for(int i = 0; i< numberOfEmployees;i++) {
                    chocolates[i] = Integer.parseInt(chocolateInputs[i]);
                }  
                Arrays.sort(chocolates);
                min = chocolates[0];
                operations[index] = distributeCholocalates(chocolates);
                index++;
				distributions--;
            }
            for(int d = 0;d<operations.length;d++) {
				System.out.println(operations[d]);
			}
            
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
}






























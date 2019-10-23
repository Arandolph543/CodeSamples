/*Description: Finds the average diagonal sum with 2D int matrice.
Author:April Randolph
Date: 07/18/2017,10/23/2019 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.Math;
import java.util.regex.*;

public class DiagonalSumValueTwoDimArray {

    public static int absoluteValue(int n, int[][] a) {
        int avgSumNumber = 0;
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
	for(int i=0;i<a.length;i++) {
		firstDiagonalSum = Math.abs(a[i][i] + firstDiagonalSum);
		secondDiagonalSum =  Math.abs(secondDiagonalSum + a[i][n - i -1]);
	}
          
        avgSumNumber = Math.abs(firstDiagonalSum - secondDiagonalSum);      
        return avgSumNumber;
    }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
               System.out.println("Input: " + a[a_i][a_j]);
            }
        }
        System.out.println("The sum absolute for matrices is : " + absoluteValue(n, a));
    }
}

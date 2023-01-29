/* Description: Kadane is an alogrithm that finds the maximum product in a subarray within a given array.
Author: April Randolph
Date: 01/26/23
 */
import java.lang.*;
import java.io.*;
import java.util.*;

class Kadane {
    //Find the highest in the given k of the array of the numbers in the array.
    static int maxSubArraySum(int a[])
    {
        int index = 0;
        int size = a.length;
        int max = Integer.MIN_VALUE, highest = 0;
        for (int i = 0; i < size; i++) {
            highest = highest + a[i];
            if (max < highest) {
                max = highest;
                index++;
            }
            if (highest < 0) {
                System.out.println("Debug: " + max + " heighest " + highest);
                highest = 0;
                index++;
            }

        }
        //Indicate to the console that the whole array was the subarray all positive number or all negative.
        if(index==size && max<=highest) {
            System.out.println("The positive numbers used the whole array added togther.");
        } else if(max<=0 || index==size) {
            System.out.println("The negative numbers used the whole array added together resulting in zero.");
        }
        return max;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Please enter the array of numbers, without spaces: (Press-enter)");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String inputArray = buffer.readLine();
            int n = inputArray.length();
            int[] arr = null;
            if(inputArray != null) {
                arr = new int[n];
                for(int i = 0;i<n;i++) {
                    if(String.valueOf(inputArray.charAt(i)).equals("-")) {
                        i++;
                        n--;
                        arr[i] = Integer.valueOf(-1 * Integer.valueOf(String.valueOf(inputArray.charAt(i))));
                    } else {
                        arr[i] = Integer.valueOf(String.valueOf(inputArray.charAt(i)));
                    }
                }
            }
            System.out.println("The highest id " + maxSubArraySum(arr));
        }  catch(IOException ex) {
            System.out.println(ex);
        }
    }
}

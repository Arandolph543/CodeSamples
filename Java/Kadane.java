/* Description: Kadane is an alogrithm that finds the maximum product in a subarray within a given array.
Author: April Randolph
Date: 01/26/23
 */
import java.lang.*;
import java.io.*;
import java.util.*;

class Kadane {
    // Driver Code
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max = Integer.MIN_VALUE, highest = 0;
        for (int i = 0; i < size; i++) {
            highest = highest + a[i];
            if (max < highest)
                max = highest;
            if (highest < 0)
                highest = 0;
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

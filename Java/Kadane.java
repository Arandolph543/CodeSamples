/* Description: Kadane is an alogrithm that finds the maximum product in a subarray within a given array.
Author: April Randolph
Date: 01/26/23
 */
import java.lang.*;
import java.io.*;

public class Kadane {

    public static long Kadane(int[] arr, int n) {
        long max= arr[0];
        long j, i = 0;
        int[] temp = new int[n];
        for(i =0;i<ni++) {
            int x = max + arr[i];
            if(arr[i]>max) {
                max = arr[i];
                temp[i] = max;
                j = i;
            } else if(arr[i]+max>max) {
                max = arr[i]+max;
                temp[i] = max;
            }
        }
        return max
    }

    public static void main(String{[] args) {
        try {
            System.out.println("Please enter the array of numbers, without spaces: (Press-enter)");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String inputArray = buffer.readLine();
            int n = inputArray.length();
            int[] arr = null;
            if(inputArray != null) {
                arr = new int[n];
                for(int i = 0;i<n;i++) {
                    arr[i] = Integer.valueOf(String.valueOf(inputArray.charAt(i)));
                    System.out.print(arr[i] + " " + inputArray.charAt(i) + " " + String.valueOf(arr[i]));
                }
            }

            printArray(arr,n, k);
        }  catch(IOException ex) {
            System.out.println(ex);
        }
    }
}

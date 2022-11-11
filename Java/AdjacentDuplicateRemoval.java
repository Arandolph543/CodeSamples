/* Description: Removing Adjacent Duplicated in a String.
Author: April Randolph
Date: 07/28/18,10/19/2019,11/11/2022 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class AdjacentDuplicateRemoval {
    public static boolean allCharactersSame(char[] string, int len) {
        boolean match = true;
        if(len==0 || len==1)
            return true;
        int i = 1;
        while(match) {
            if(i==len-1)
                break;
            if(string[i-1] != string[i]) {
                match = false;
            }
            i++;
        }
        return match;
    }
    public static char[] removeAdjacentDups(char[] string, int len) {
        int res = 0;
        //Check if the same
        boolean same = allCharactersSame(string, len);
        if (same) {
            System.out.println("The number was all duplicates or the adjacent duplicates removed enough places making every number removed to null.");
            return new char[1];
        }

        int i;
        //Loop through the string and from the left most remove duplicates
        for (i = 1; i <= len-1; i++) {
            if (string[i - 1] != string[i]) {
                string[res++] = string[i - 1];
                //Keep looping and remove adjacent duplicates
                while (string[i - 1] == string[i]) {
                    i++;
                }
                if(i==len-1)
                    same = true;
            }
        }

        // Add the last character and the terminator
        string[res++] = string[i - 1];
        if(string.length==i && i==res && res==string.length) {
            System.out.println(string);
            return null;
        }
        string[res] = '\0';
        //If we removed from the string recursively call removal
        if (res != len) {
            removeAdjacentDups(string, res); //Shlemial Painter's Algorithm
        }

        String result = new String(string);
        return result.substring(0,res).toCharArray();
    }
    public static void main(String[] args) {
        AdjacentDuplicateRemoval classAdjacentDuplicateRemoval = new AdjacentDuplicateRemoval();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numOfInputs = 0;
        char[] sentences;
        char[] substrings;
        try {
            numOfInputs = Integer.parseInt(buffer.readLine());
            sentences = new char[numOfInputs];
            substrings = new char[numOfInputs];
            for (int i = 0; i < numOfInputs; i++) {
                BigInteger input = new BigInteger(buffer.readLine());
                sentences = input.toString().toCharArray();
                //Calls the method for string method call
                substrings = classAdjacentDuplicateRemoval.removeAdjacentDups(sentences, input.toString().length());
            }
            if(substrings != null && substrings.length > 0) {
                for (int d = 0; d < substrings.length; d++) {
                    System.out.print(substrings[d]);
                }
                System.out.println("");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

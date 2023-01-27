/*Description: Taking two String determine wether the two words are anagrams. Return the boolean of the given pair and input from the user as to the amount of tests.
Author: April Randolph
Date: 10/19/2019 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram {
    
    public static Boolean isAnagram(String sentence1, String sentence2) {
	boolean isAnagram = false;
	char[] word1 = sentence1.toCharArray();
	char[] word2 = sentence2.toCharArray();
	Arrays.sort(word1);
	Arrays.sort(word2);
	return Arrays.equals(word1,word2);
    }
     
    public static void main (String[] args) {
	Anagram anagramClass = new Anagram();
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	int numOfInputs = 0;
	String[] sentences = null;
	Boolean[] anagram = null;
	try { 
		numOfInputs = Integer.parseInt(buffer.readLine());
		sentences = new String[numOfInputs*2];
		anagram = new Boolean[numOfInputs];
		for(int i = 0; i< sentences.length;i++) {
			sentences[i] = buffer.readLine(); 
		}  
		int count = 0;
		for(int d = 0;d<sentences.length;d++) {
			anagram[count] = anagramClass.isAnagram(sentences[d], sentences[d++]);
			count++;
		}   
		for(int l=0;l<numOfInputs;l++) {
		    if(anagram[l].equals(true)){
			System.out.println("YES");
		    }else {
			System.out.println("NO");
		    }
		}			
	} catch(Exception ex) {
		System.out.println(ex.toString());
	}
    }
}

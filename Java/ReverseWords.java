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
            sentences = new String[numOfInputs];
            anagram = new String[numOfInputs];
            for(int i = 0; i< numOfInputs;i++) {
                sentences[i] = buffer.readLine(); 
				//System.out.println(sentences[i]);
            }  
			int count = 0;
			for(int d = 0;d<numOfInputs;d++) {
				anagram[d] = anagramClass.isAnagram(sentences[count], sentences[count+1]);
				System.out.println(anagram[d]);
				count++;
			}            
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
	}
}
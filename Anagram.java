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
	   System.out.println("Debug: " + String.valueOf(word1).toString() + " " + String.valueOf(word2).toString());
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
            for(int i = 0; i< numOfInputs*2;i++) {
                sentences[i] = buffer.readLine(); 
				//System.out.println(sentences[i]);
            }  
			int count = 0;
			
			for(int d = 0;d<numOfInputs;d++) {
				anagram[d] = anagramClass.isAnagram(sentences[count], sentences[count+1]);
				// System.out.println(anagram[d]);
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
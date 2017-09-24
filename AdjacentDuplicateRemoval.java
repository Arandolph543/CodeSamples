import java.util.*;
import java.lang.*;
import java.io.*;

class AdjacentDuplicateRemoval {
    
    public static String removeAdjacentDups(String string) {
        char[] arrayChars = string.toCharArray();
        StringBuilder build = new StringBuilder();
        for(int i = 0;i<arrayChars.length;i++) {
            if(!arrayChars[i].equals(arrayChars[i+1]) {
                build.append(arrayChars[i]);
            }
        }
        return build.toString();
    }
    
    
    
	public static void main (String[] args) {
	    AdjacentDuplicateRemoval classAdjacentDuplicateRemoval = new AdjacentDuplicateRemoval();
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numOfInputs = 0;
        String[] sentences = null;
        String[] substrings = null;
        try { 
            numOfInputs = Integer.parseInt(buffer.readLine());
            sentences = new String[numOfInputs];
            substrings = new String[numOfInputs];
            for(int i = 0; i< numOfInputs;i++) {
                sentences[i] = buffer.readLine(); 
				//System.out.println(sentences[i]);
				substrings[i] = classAdjacentDuplicateRemoval.removeAdjacentDups(sentence[i]);
				
            }  

			for(int d = 0;d<numOfInputs;d++) {
			    System.out.println(substrings[d]);
			}
	}
}
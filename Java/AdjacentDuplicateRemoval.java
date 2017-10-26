import java.util.*;
import java.lang.*;
import java.io.*;

class AdjacentDuplicateRemoval {
    
    public static String removeAdjacentDups(String string) {
        StringBuilder sb = new StringBuilder();
		if (string.length() > 0) {
			char prev = string.charAt(0);
			sb.append(prev);
			for (int i = 1; i < string.length(); ++i) {
				char cur = string.charAt(i);
				if (cur != prev) {
					sb.append(cur);
					prev = cur;
				}
			}
		}
        return sb.toString();
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
		substrings[i] = classAdjacentDuplicateRemoval.removeAdjacentDups(sentence[i]);		
            }  
            for(int d = 0;d<numOfInputs;d++) {
		System.out.println(substrings[d]);
            }
	}
}

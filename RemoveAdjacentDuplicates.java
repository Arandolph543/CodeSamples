import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveAdjacentDuplicates {
    
    public static String removeAdjacentDups(String string) {
        int index = 1;
        StringBuilder build = new StringBuilder();
        for(int i = 0;i<string.length();i++) {
			int temp = i+1;
			if(temp< string.length() && build.length() > 0) {
				System.out.println(String.valueOf(string.charAt(i)) + " " + build.charAt(build.length()-1));
				if((string.charAt(i) == string.charAt(temp)) || (string.charAt(i) == build.charAt(build.length()-1))) {
					i++;
				} else {
					build.append(string.charAt(i));
				}
			} else {
				build.append(string.charAt(i));
			}
        }
        return build.toString();
    }
        
	public static void main (String[] args) {
	    RemoveAdjacentDuplicates classAdjacentDuplicateRemoval = new RemoveAdjacentDuplicates();
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
				substrings[i] = classAdjacentDuplicateRemoval.removeAdjacentDups(sentences[i]);
				
            } 
		} catch(Exception ex) {
			System.out.println(ex.toString());
		}

		for(int d = 0;d<numOfInputs;d++) {
			System.out.println(substrings[d]);
		}
	}
}
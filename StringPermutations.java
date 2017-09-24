import java.lang.*;
import java.util.*;
import java.io.*;

class StringPermutations {

	static void permute(String input) {
		int inputLength = input.length();
		boolean[ ] used = new boolean[ inputLength ];
		StringBuffer outputString = new StringBuffer();
		char[ ] charArray = input.toCharArray( );
  
		doPermute ( charArray, outputString, used, inputLength, 0 );
	}

	static void doPermute ( char[ ] charArray, StringBuffer outputString, boolean[ ] used, int inputLength, int level) {
		if( level == inputLength) {
			System.out.println ( outputString.toString()); 
		}

		for(int i = 0; i < inputLength; ++i) {       
		   if( used[i] ) {
			   level++;
			   return;
		   }

			outputString.append( charArray[i] );      
			used[i] = true;       
			doPermute( charArray, outputString, used, inputLength, level + 1 );       
			used[i] = false;       
			outputString.setLength( outputString.length() - 1 );   
		}
	}
	
	public static void main(String args[]) {
		
		BufferedReader stringBuffer; 
		try {
			String in;
			stringBuffer = new BufferedReader(new InputStreamReader(System.in));
		
			while ((in = stringBuffer.readLine()) != null) {
				permute(in);
			}
		} catch (IOException e) {
			System.out.print("An " + e + " has occurred.");			
		}	
	}
 }
 
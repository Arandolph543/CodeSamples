/*
Author: April Randolph
Date: 02/08/15
Takes a file from the console as input. Finds the distinct words 
used in the file.
*/
import java.io.FileReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.lang.String;

public class DistinctWords {
		
	public List<String> getDistinctWords(String words) {
		String sanitizedString = words.replaceAll("\\p{Punct}", " ").toLowerCase();
		StringTokenizer st = new StringTokenizer(sanitizedString);
		List<String> distinctWords = new ArrayList<String>();
		
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			if(word != null && !distinctWords.contains(word)) {
				distinctWords.add(word);
			}				
		}
		return distinctWords;
	}
	
	public static void main(String[] a) {
		DistinctWords dw = new DistinctWords();
		String inputFileName = "";
		String input = "";
		String fileText = "";
		System.out.println("Please input the location of the word text file: ");
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			if((input = br.readLine()) != null) {	
				inputFileName += input;
			}
			br.close();
			File file = new File(inputFileName);
			FileReader inputStream = new FileReader(inputFileName);
			BufferedReader fileBr = new BufferedReader(inputStream);
			while((input = fileBr.readLine()) != null) {
					fileText += input;
			}
			List<String> list = dw.getDistinctWords(fileText);
			System.out.print("These are the distinct words " + list);
		} catch (FileNotFoundException e) {
			System.out.println("An FileNotFoundException has occurred " + e.toString());
		} catch (IOException e) {
			System.out.println("An IOException has occurred " + e.toString());
		}			
	}	
}

//package HTMLTagCounter.src;

import java.io.*;
import java.util.*;
import java.net.*;
import org.jsoup.*;

public class TagCountRunner {

	public static void print(TreeMap<String,Integer> tagMap) {
		for(Map.Entry<String,Integer> entry : tagMap.entrySet()) {
			  String key = entry.getKey();
			  Integer value = entry.getValue();
			  if(value > 0) {
				  System.out.println("Tag: <" + key + "> Count: " + value);  
			  }
		}
	}

	

	public static void main(String[] args) {
		TagCounter tc = new TagCounter();
		Boolean read = false;
		TreeMap<String,Integer> tagTree = null;
		System.out.println("Please enter a url: " );
		try {
			String input = "";
			do { 
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				input = buffer.readLine();
				if(input.toLowerCase().equals("goodbye")) 
					break;
				read = tc.store(input);
				if(!read) 
					break;
				tagTree = tc.getHTMLTreeMap();
				print(tagTree);
			} while(!input.toLowerCase().equals("goodbye"));
		} catch(IOException ex) {
			System.out.println(ex.toString());
		} 
		
		System.out.println("Thanks for using my program!");
		System.exit(0);
	}


}
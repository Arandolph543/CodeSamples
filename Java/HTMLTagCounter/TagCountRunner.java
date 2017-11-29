import java.io.*;
import java.util.*;
import java.net.*;

public class TagCountRunner {

	public TagCountRunner() {
		
	}

	

	public static void main(String[] args) {
		System.out.println("Please enter a url: " );
		try {
			String input = "";
			do { 
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				input = String.valueOf(buffer.readLine());
				System.out.println("Debug: "+ input);
				URL url = new URL(input);			
				TagCounter tc = new TagCounter();
				tc.store(input);
				
			} while(input.equals("goodbye"));
		} catch(IOException ex) {
			System.out.println("Main: " + ex.toString());
		} 
		
		System.out.println("Thanks for using my program!");
		System.exit(0);
	}


}
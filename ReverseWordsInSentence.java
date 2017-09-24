/* Author: April Randolph
Description: A program that takes a sentence and reverses the words. 
Date: 06/27/17
*/

import java.lang.*;
import java.util.*;

public class ReverseWordsInSentence {

	//a function as main to reverse words given in sentence
	public static void main(String[] args) {
		String sentence = "This is word for text characters to be read.";
		args = sentence.split(" ");
		
		for(int i = args.length-1;i>=0;i--) {
			System.out.println(args[i].toString() + " ");
		}
	}
}

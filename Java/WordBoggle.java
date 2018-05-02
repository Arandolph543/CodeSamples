import java.lang.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class WordBoggle {

	public List<String> sortLettersIntoWords(List<String> dict,  String letters) {
		List<String> words = new ArrayList<>();
		int index = 0;
		for(int k = 0;k<dict.size();k++) {
			for(int i = 0;i<letters.length();i++) {
				System.out.println(dict.get(k) + " " + letters.charAt(i));
				if(dict.get(k).contains(String.valueOf(letters.charAt(i)))) {
					index++;
				}
				if(index == dict.get(k).length()) {
					words.add(dict.get(k));
					index = 0;
				}
			}
		}
		return words;	
	}



	public static void main(String[] args) {
		WordBoggle wb = new WordBoggle();
		List<String> wordListDictionary = new ArrayList<>();
		wordListDictionary.add("dog");
		wordListDictionary.add("fern");
		wordListDictionary.add("apple");
		wordListDictionary.add("frogs");
		List<String> wordsFound = wb.sortLettersIntoWords(wordListDictionary, "ernfos");
		for(String word : wordsFound) {
			System.out.print(word + " ");
		}
	
	}




}

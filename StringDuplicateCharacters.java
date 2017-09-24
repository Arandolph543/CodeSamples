import java.lang.String;
import java.util.*;

public class StringDuplicateCharacters { 

	public int findDuplicates(String charString) {
		char[] charArr = charString.toCharArray();
		Map<String, Integer> map = new HashMap<String, Integer>();
		int duplicates = 0;
		
		for(char character: charArr) {
			//System.out.println(character + " " + map.containsKey(character));
			if(map.containsKey(String.valueOf(character))) {
				duplicates++;
				int n = map.get(String.valueOf(character));
				map.remove(String.valueOf(character));
				map.put(String.valueOf(character), n++);
			} else {
				//System.out.println("Adding character.");
				map.put(String.valueOf(character), 1);
			}
		}
		return duplicates;
	}

	public static void main(String[] a) {
		StringDuplicateCharacters sdc = new StringDuplicateCharacters();
		String chars = "thisismytestphrasetodedup";
		System.out.println("The string is " + chars.toString() + " with " + sdc.findDuplicates(chars) + ".");
	}
}

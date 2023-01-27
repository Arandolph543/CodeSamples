import java.util.*;

public class SecretExpertsCommunication {

	static HashMap<Integer,String> cribSheet = new HashMap<Integer,String>();
	public static void createDecoder() {
		for(int i = 0;i<26;i++) {
			cribSheet.put(i+1,Character.toString((char)(65+ i)));
		}
	}

	static String[] decodeMessage(String message) {
		char partialMessage = 0;
		int index = 0;
		int headPointer = 0;
		String[] replies = new String[message.length() * message.length()]; 
		for(int i =0;i<message.length();i++) {
			headPointer++;
			System.out.println("Debug: " + cribSheet.get(Character.getNumericValue(message.charAt(i))));			
			replies[i] += cribSheet.get(Character.getNumericValue(message.charAt(i)));
			if((i+1) < message.length()) {
				int number = Integer.valueOf(String.valueOf(message.charAt(i)) + String.valueOf(message.charAt(i+1)));
				if(number < 26) {
					replies[i] += cribSheet.get(number);
				}
			}
		}
		return replies;
	}


	public static void main(String[] args) {
		String message = "2116";
		createDecoder();
		String[] messages = decodeMessage(message);
		for(String code : messages) {
			System.out.println(code);
		}
	
	}

}

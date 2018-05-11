import java.util.Stack;

public class Palindrome {

	static boolean isPalindrome(String input) {
		String noWhiteSpacesInput = input.replace(" ", "");
		char[] arrayChars = noWhiteSpacesInput.toCharArray();
		boolean isPalindrome = true;
		int j = arrayChars.length-1;
		int middle = arrayChars.length/2;
		for(int i = 0;i<middle;i++, j--) {
			if(arrayChars[i] != arrayChars[j]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		String input = "race car";
		System.out.println(input.toString() + " " + isPalindrome(input));		
	}

}

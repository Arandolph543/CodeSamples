import java.lang.*;

public class StringReverseRecursive {

	public String reverseString(String string) {
		String reverse = "";
		
		if(string.length()<2) {
			return string;
		} else {
			reverse += string.charAt(string.length()-1) +
				reverseString(string.substring(0, string.length()-1));
				return reverse;
		}	
	}

	public static void main(String args[]) {
		StringReverseRecursive revRecStr = new StringReverseRecursive();
		System.out.println("The string 'Please Reverse Me!' reversed is: " + revRecStr.reverseString("Please Reverse Me!"));
	}
}

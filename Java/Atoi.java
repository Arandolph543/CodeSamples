import java.util.*;
import java.lang.*;

public class Atoi {

	static int convertIntoInteger(String in) {
		int res = 0;
		int n = in.length();
		String ch;
		int count = 0;
		if(n == 0)
			return -1;
		
		for(int i =0; i<n;i++) {
			ch = Character.toString(in.charAt(i));
			if(Integer.valueOf(ch) >= 0 && Integer.valueOf(ch) <= 9) {
				count++;
			}
		}
		if(count == n) {
			return Integer.valueOf(in);
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		String input = "1234";
		System.out.println(input.toString() + " is " + convertIntoInteger(input));	
	}


}

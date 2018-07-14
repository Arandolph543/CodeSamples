import java.util.*;
import java.lang.*;

public class RotateString {

	public static int stringRotated(String str1, String str2) {
		int k = str2.length()-1;
		int length = (str1.length()*2)-2;
		int i = 0;
		int res = 0;
		int j = 0;
		
		while(i<k) {
			if(str1.length()-1 == k) {
				char[] b = new char[length];
				for(int m = i;m<k;m++) {
					b[m] = b[k+m] = str1.char
					At(m);
				}	
				char str2Char = str2.charAt(i);
				System.out.println("Debug: " + b.length + " " + str2Char);
				for(int l = 0;l<length;l++) {
					if(str2Char == str2.charAt(l) && (i-2 <= l || i+2 >= l)) {
						res = 1;
						break;
					}
				}
				i++;
			}				
		}
		return res;
	}

	public static void main(String[] args) {
		String str1 = "amazing";
		String str2 = "anzigam";
		System.out.println(stringRotated(str1, str2));	
	}
}

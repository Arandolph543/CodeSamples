/*Description: Find the string that needs to not be edited given two Strings.
Author: April Randolph
Date: 03/05/20*/

import java.io.*;
public class OneEdit {

	int min(int x, int y, int z) {
		int min = 0;
		if(y<=x && y<=z) {
			return y;
		}else if(x<=y && x<=z) {
			return x;
		}else {
			return z;
		}
	}

	int checkOneEdited(String strEditable1, String strEditable2, int l, int h) {
			if(l== 0)
				return h;
			
			if(h == 0)
				return l;
			
			if(strEditable1.charAt(l-1) == strEditable2.charAt(h-1))
				return checkOneEdited(strEditable1, strEditable2, l-1, h-1);
			
			return 1 + min (checkOneEdited(strEditable1, strEditable2, l, h-1), 
							checkOneEdited(strEditable1, strEditable2, l-1, h), 
							checkOneEdited(strEditable1, strEditable2, l-1, h-1));
		
	}

	public static void main(String[] args) {
		OneEdit oe = new OneEdit();
		String strEditable1 = "saturday";
		String strEditable2 = "Sunday";
		String strEditable = "sat";
		try {
			BufferedReader inputStringReader = new BufferedReader(new InputStreamReader(System.in));
			strEditable1 = inputStringReader.readLine();
			strEditable2 = inputStringReader.readLine();
			System.out.println("The string " + strEditable1 + " " + strEditable2 + "  : " + oe.checkOneEdited(strEditable1, strEditable2, strEditable1.length(), strEditable2.length()));
			
		} catch(IOException ex){
			System.out.println(ex);
		}
	}

}

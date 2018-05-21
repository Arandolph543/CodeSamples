import java.lang.*;


public class AddBinaryString {

	static String addBinary(String str1, String str2) {
		int numToAdd = Integer.parseInt(str1, 2);
		int numToAdd2 = Integer.parseInt(str2, 2);
		String result = String.valueOf(numToAdd + numToAdd2);
		return result;		
	}
	
	public static void main(String[] args) {
		String binaryString = "11";
		String binaryString2 = "1011";
		System.out.println(addBinary(binaryString, binaryString2));
		
	}

}

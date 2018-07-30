import java.lang.StringBuilder;
import java.lang.Character;

public class DecodeStringInPlace {

	public String stringDecoder(String codeValueInput) {
		StringBuilder decodedResultString = new StringBuilder();
		StringBuilder subString = new StringBuilder();
		int count = 0;
		int innerCount = 0;
		int length = codeValueInput.length();
		int i = 0, j = 0, k = 0;
			System.out.println("Debug: coded character " + Character.getNumericValue(codeValueInput.charAt(i)));
		while( i<length) {
			if((Character.getNumericValue(codeValueInput.charAt(i)) > 0 && Character.getNumericValue(codeValueInput.charAt(i)) < 9) || ((Character.getNumericValue(codeValueInput.charAt(i)) > 10) && (Character.getNumericValue(codeValueInput.charAt(i)) < 37)) && (Character.getNumericValue(codeValueInput.charAt(i)) != -1)) {
				if((Character.getNumericValue(codeValueInput.charAt(i)) > 10) && (Character.getNumericValue(codeValueInput.charAt(i)) < 37) && count == 0) {
					while((Character.getNumericValue(codeValueInput.charAt(i)) > 10) && (Character.getNumericValue(codeValueInput.charAt(i)) < 37)) {
				System.out.println("Debug: letter only from 10 to 37 " + Character.getNumericValue(codeValueInput.charAt(i)));
						subString.append(String.valueOf(codeValueInput.charAt(i)));
						i++;
					}
					
				}
				if(count == 0 && count != -1) {
					System.out.println("Debug: count " + Character.getNumericValue(codeValueInput.charAt(i)));
					count = Character.getNumericValue(codeValueInput.charAt(i));
				} 
				while((count > 0) && ((Character.getNumericValue(codeValueInput.charAt(i)) > 10) && (Character.getNumericValue(codeValueInput.charAt(i)) < 37))) {
					System.out.println("Debug: coded letters " + Character.getNumericValue(codeValueInput.charAt(i)));
					subString.append(String.valueOf(codeValueInput.charAt(i)));
					i++;
				}
				
				while((count > 0) && subString.length() > 0) {
					decodedResultString.append(subString.toString());
					count--;
				}
				subString.delete(0, subString.length());
			}
		}
		return decodedResultString.toString();
	}



	public static void main(String[] args) {
		String stringInput = "3[ds[4kj]]zzzz[1d]";
		DecodeString decode = new DecodeString();
		System.out.println(decode.stringDecoder(stringInput));
	}




}

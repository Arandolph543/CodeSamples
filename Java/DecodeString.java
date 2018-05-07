import java.lang.StringBuilder;
import java.lang.Character;

public class DecodeString {

	public String stringDecoder(String codeValueInput) {
		StringBuilder decodedResultString = new StringBuilder();
		StringBuilder subString = new StringBuilder();
		int count = 0;
		int innerCount = 0;
		for(int i = 0;i<codeValueInput.length();i++) {
			if((Character.getNumericValue(codeValueInput.charAt(i)) > 0 && Character.getNumericValue(codeValueInput.charAt(i)) < 9) || ((Character.getNumericValue(codeValueInput.charAt(i)) > 10) && (Character.getNumericValue(codeValueInput.charAt(i)) < 37)) &&  (Character.getNumericValue(codeValueInput.charAt(i)) != -1)) {
				if(count == 0) {
					count = Character.getNumericValue(codeValueInput.charAt(i));
				}
				while((count > 0) && ((Character.getNumericValue(codeValueInput.charAt(i)) > 10) && (Character.getNumericValue(codeValueInput.charAt(i)) < 37))) {
					subString.append(String.valueOf(codeValueInput.charAt(i)));
					i++;
				}
				int subIndex = subString.length();
				while(count > 0 && subString.length() > 0) {
					decodedResultString.append(subString.toString());
					count--;
				}
				subString.delete(0, subIndex);
			}
		}
		return decodedResultString.toString();
	}



	public static void main(String[] args) {
		String stringInput = "3[ds[4kj]]";
		DecodeString decode = new DecodeString();
		System.out.println(decode.stringDecoder(stringInput));
	}




}

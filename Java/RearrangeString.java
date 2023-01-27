public class RearrangeString {

	static final int MAX_CHAR = 26;

	static String rearrangeString(String input) {
		if(input == null)
			throw new IllegalArgumentException();
		
		int[] alphabet = new int[MAX_CHAR];
		int sum = 0;
		
		for(int i = 0;i<input.length();i++) {
			
			if(Character.isUpperCase(input.charAt(i))) {
				alphabet[input.charAt(i) - 'A']++;
			} else {
				sum = sum + (input.charAt(i) - '0');
			}
		}	
		String resultString = "";
		for(int n = 0;n<alphabet.length;n++) {
			char ch = (char)('A' +n);
			
			while(alphabet[n]-- != 0) {
				resultString = resultString + ch;
			}
		}
		resultString = resultString + sum;		
		
		return resultString;
	}


	public static void main(String[] args) {
		String arrangeString = "DKJHDFACB324";
		System.out.println(rearrangeString(arrangeString));
	}







}

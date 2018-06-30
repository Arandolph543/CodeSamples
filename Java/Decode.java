public class Decode {

	int decodeMessage(String number) {
		System.out.println(number.length());
		char[] length = new char[number.length()];
		String letter = "";
		int count = 0;
		int index = 0;
		
		for(int i = 0;i<number.length();i++) {
			length[i] = number.charAt(i);
			index = i;
			if(Character.getNumericValue(length[i]) < 26) {
				count++;
				if((length[index++] + length[i]) < 26 ) {
					count++;					
				} 
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String message = "2131";
		Decode decoder = new Decode();
		System.out.println(decoder.decodeMessage(message));
	}
}

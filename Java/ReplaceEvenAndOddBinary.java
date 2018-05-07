public class ReplaceEvenAndOddBinary {

	public String convertToOdd(Integer num) {
		String binary = Integer.toBinaryString(num);
		System.out.println(binary);
		String temp = binary.replace("1", "2");
		temp = temp.replace("0", "1");
		String oddBinary = temp.replace("2", "0");
		return oddBinary;
	}

	public static void main(String[] args) {
		ReplaceEvenAndOddBinary reaob = new ReplaceEvenAndOddBinary();
		System.out.println(reaob.convertToOdd(new Integer(45)));
	}

}

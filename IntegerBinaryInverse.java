import java.util.*;

class IntegerBinaryInverse {

	public static int getInverse(int number) {
		String binary = Integer.toBinaryString(number);
		System.out.println(binary);
		binary = binary.replaceAll("0", "x");
		binary = binary.replaceAll("1", "0");
		binary = binary.replaceAll("x", "1");
		//binary.replace('0', '2').replace('1', '0').replace('2', '1');
		System.out.println(binary);
		int inverse = Integer.parseInt(binary, 2);
		System.out.println("Inverse " + inverse);
		return inverse;
	}

	public static void main(String[] args) {
		IntegerBinaryInverse ibi = new IntegerBinaryInverse();
		int number = 50; 
		
		int inverse = ibi.getInverse(number);
		System.out.println(String.valueOf(inverse));
	
	}

}

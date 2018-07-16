import java.util.*;
import java.io.*;

public class PrecisionBigDecimal {

	public static void main(String[] args) {
		String sentence = "this.sentence";
		System.out.println(".");
		String[] words = sentence.split(".");
		for(int i = words.length-1;i>0;--i) {
			System.out.println(words[i]);
		}
		Scanner in = new Scanner(System.in);
		float numFloat = in.nextFloat();
		System.out.println(numFloat);
	}
}

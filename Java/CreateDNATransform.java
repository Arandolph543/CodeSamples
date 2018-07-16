import java.util.*;

class CreateDNATransform {

	public static void main(String[] args) {
		String DNAstrand = "AACCGTTT";
		DNAstrand = DNAstrand.replace('A', 'M');
		DNAstrand = DNAstrand.replace('C', 'X');
		DNAstrand = DNAstrand.replace('T', 'Y');
		DNAstrand = DNAstrand.replace('G', 'C');
		DNAstrand = DNAstrand.replace('X', 'G');
		DNAstrand = DNAstrand.replace('Y', 'A');
		DNAstrand = DNAstrand.replace('M', 'T');
		char[] array = DNAstrand.toCharArray();
		Arrays.sort(array);
		for(char item : array) {
			System.out.print(String.valueOf(item).toString());
		}
	}

}


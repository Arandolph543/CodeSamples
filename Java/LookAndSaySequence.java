public class LookAndSaySequence {

	int[] lookAndSayGenerate(int n) {
		int[] seqNumbersLAS = new int[n];
		seqNumbersLAS[0] = 1;
		int count = 0;
		int seq = 0;
		for(int i = 1;i<n;i++) {
			String nthElement = String.valueOf(seqNumbersLAS[i]);
			for(int k =0;k<nthElement.length();k++) {
				int temp = Integer.valueOf(nthElement.charAt(k));
				System.out.println("Debug: comparison " + temp + " " + Integer.valueOf(nthElement.charAt(k)));
				while(Integer.valueOf(nthElement.charAt(k)) == temp) {
					count++;
				}
				System.out.println("Debug: count " + count);
				if(count > 1) {
					seqNumbersLAS[i] = count;
					seqNumbersLAS[i+1] = Integer.valueOf(nthElement);
					count = 0;
				} else {
					seqNumbersLAS[i] = 1;
					seqNumbersLAS[i+1] = Integer.valueOf(nthElement);
					count = 0;
				}
			}
		}
		return seqNumbersLAS;
	}

	public static void main(String[] arg) {
		LookAndSaySequence lass = new LookAndSaySequence();
		int n = 6;
		int[] nthSequence = new int[6];
		nthSequence = lass.lookAndSayGenerate(n);
		for(int i = 0;i<n;i++) {
			System.out.print(nthSequence[i] + " " );
		}
	}
}

public class FibinocciRecursive {
	
	public static int fibinocciRec(int fibNum) {
		if(fibNum == 0) 
			return 0;
		if(fibNum < 2) 
			return 1;
		int tempFibNumber = fibinocciRec(fibNum -1) + fibinocciRec(fibNum - 2);
		return tempFibNumber;		
	}
	
	public static void printReverseFib(int[] fib) {
		for(int x = fib.length;x<fib.length;x--) {
			System.out.println(fib[x] + " ,");
		}
	}
	
	public static void main(String[] arg) {
		FibinocciRecursive seq = new FibinocciRecursive();
		System.out.print("Your Fibinocci sequence base 1,1 to 100 is ");
		int x1 = 1;
		int x2 = 1;
		int fibSeq = seq.fibinocciRec(100);
		System.out.println(fibSeq);
		int[] fib = new int[fibSeq];
		int seqNum = 0;
		int i = 0;
		// while((seqNum = seq.fibinocciRec(x1,x2, fib, i)) != -1){ 
			// System.out.print("This is seq: " + seqNum + " index " + i);
			// if(seq == null) {
				// break;
			// } 
		// }
	}	
}

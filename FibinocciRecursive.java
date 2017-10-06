public class FibinocciRecursive {
	
	public static int fibinocciRec(int fibNum) {
		if(fibNum == 0) 
			return 0;
		if(fibNum < 2) 
			return 1;
		return fibinocciRec(fibNum -1) + fibinocciRec(fibNum - 2);		
	}
	
	public static void main(String[] arg) {
		FibinocciRecursive seq = new FibinocciRecursive();
		System.out.print("Your Fibinocci sequence base 1,1 to 10 is ");
		for(int i = 0; i<= 10;i++) {
			System.out.println(" Seq: " + i + " " + fibinocciRec(i));
		}
	}	
}


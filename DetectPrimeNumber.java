public class DetectPrimeNumber {

	public static boolean isPrimeNumber(int number) {
		boolean prime = false;
		
		if(number > 1) {
			for(int i = 2; i <= number/2; i++) {
				if(number%i == 0) {
					if(number == 2 || number == 3) {
						return true;
					} else {
						return false;
					}
				}
			}
		}
		
		prime = true;
		return prime;
	}
	
	public static void main(String[] a) {
		DetectPrimeNumber dp = new DetectPrimeNumber();
		System.out.print("The number 11 is ");
		if(dp.isPrimeNumber(11)) {
			 System.out.print("true.");
		} else {
			System.out.print("false.");
		}
	}
}

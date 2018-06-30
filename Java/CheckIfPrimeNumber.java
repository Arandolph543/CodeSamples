public class CheckIfPrimeNumber {

	boolean checkIfPrime(int n) {
		if(n <= 1) 
			return false;
		
		for(int i = 2;i<n;i++) {
			if(n % i == 0) 
			return false;	
		}
		return true;	
	}

	public static void main(String[] arg) {
		CheckIfPrimeNumber cip = new CheckIfPrimeNumber();
		System.out.println(cip.checkIfPrime(51));
	}
}

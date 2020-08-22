/* Description: Finds the integer as a prime number returning true or false.
Author: April Randolph
Date:08/21/20*/
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

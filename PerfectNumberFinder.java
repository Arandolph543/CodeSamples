import java.lang.*;

public class PerfectNumberFinder {

	public void isPerfectNumber(int numb) {
		int perNum = 0;
		
		for(int i = 1;i<=numb/2;i++) {
			if(numb%i == 0) {
				perNum += i;
			}		
		}
				
		if(perNum==numb) {
			System.out.println("Your number is perfect number.");
		} else {
			System.out.println("Your number is not a perfect number.");
		}	
	}

	public static void main(String args[]) {
		PerfectNumberFinder perfNum = new PerfectNumberFinder();
		perfNum.isPerfectNumber(6);
	}
}

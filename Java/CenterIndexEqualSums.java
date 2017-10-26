public class CenterIndexEqualSums {

	public int IndexForEqualSummedSides(int[] numbers) {
		int sumLeft = 0;
		int sumRight = 0;
		int index = 0;
		int endIndex = numbers.length - 1;
		
		while(true) {
			if(sumLeft > sumRight) {
				sumRight += numbers[endIndex--];
				System.out.println("sd2gt: " + sumRight + " EI: " + endIndex);
			} else {
				sumLeft += numbers[index++];
				System.out.println("sd1gt: " + sumLeft + " Ind: " + index);
			}
			if(index > endIndex) {
				if(sumLeft==sumRight) {
					break;
				} else {
					System.out.println("An error has occurred in the input.");
				}
			}			
		}
		return endIndex;	
	}

	public static void main(String[] args) {
		CenterIndexEqualSums cies = new CenterIndexEqualSums();
		int[] eqSdArr = {4,5,1,3,6,2,3,6,2,6};
		System.out.println("Index is " + cies.IndexForEqualSummedSides(eqSdArr));		
	}
}

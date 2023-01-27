public class TopTwoNumbers {

	public void MaxTwoNumbers(int[] numbers) {
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i] > num1) {
				if(num1 > num2) {
					num2 = num1;
				}
				num1 = numbers[i];
			}
			if(numbers[i] > num2 && numbers[i] < num1) {
				System.out.println(numbers[i] + "-2");
				num2 = numbers[i];
			}
		}
		
		System.out.println("The top two numbers are " + num1 + ", " + num2);
	}

	public static void main(String args[]) {
		TopTwoNumbers mtn = new TopTwoNumbers();
		int[] numList = new int[7];
		numList[0] = 11;
		numList[1] = 15;
		numList[2] = 38;
		numList[3] = 42;
		numList[4] = 63;
		numList[5] = 2;
		numList[6] = 7;
		System.out.println("The number are (11,15,38,42,63,2,7) to find the top two.");
		mtn.MaxTwoNumbers(numList);		
	}
}

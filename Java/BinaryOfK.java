/*Description: Given and integer return the binary representation.
Author: April Randolph
Date: 05/08/2018 */

class BinaryOfK {
	
	public static void main(String[] args) {
		int number = 6;
		int lftCenter = 0;
		int rghtCenter = 0;
		
		while (number != 0) {
			if((number & 1) == 1) {
				lftCenter++;
			}
			number = number>>1;
			if((number & 1) == 1) {
				rghtCenter++;
			}
			number = number>>1;

		}
		System.out.println(lftCenter == rghtCenter);
	}	
}

/*Description: Find the numbers in the array in triplets to reach a input given the sum. 
Author
Date
*/
import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

class FindArrayTriplets {

	static List<String> findTriplets(int n, int[] array) {
		int length = array.length;
		List<String> listSumValuesTriplets = new ArrayList<String>();
		StringBuilder stringbuilder = new StringBuilder();
		int tempSum = 0;
		for(int i = 0;i<length;i++) {
			for(int j=0;j<length;j++) {
				for(int k =0;k<length;k++) {
					if(i!=j && j!=k && k!=i) {
						if(array[i] < 0) {
							tempSum = tempSum - array[i];
						} else {
							tempSum = tempSum + array[i];
						}
						if(array[j] < 0) {
							tempSum = tempSum - array[i];
						} else {
							tempSum = tempSum + array[i];
						}
						if(array[k] < 0) {
							tempSum = tempSum - array[i];
						} else {
							tempSum = tempSum + array[i];
						}
						/* System.out.println("Debug: " + stringbuilder.toString() + " " + tempSum); */
						if(tempSum==n) {
							stringbuilder.append(array[i]);
							stringbuilder.append(array[j]);
							stringbuilder.append(array[k]);
							listSumValuesTriplets.add(stringbuilder.toString());
						}
						stringbuilder = new StringBuilder();
						tempSum =0;
					}
				}
			}
		}

		return listSumValuesTriplets;
	}


	static void printListOfSumN(List<String> list) {
		for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}

	public static void main(String[] args) {
		try{ 
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter a number?");
			int numberInArray = Integer.parseInt(buffer.readLine());
			System.out.println("Please enter the array of number inputs that will find a triplet to the defined amount?");
			String[] arrayUserInput = buffer.readLine().split(" ");
			int[] numberInputs = new int[arrayUserInput.length];
			for(int i = 0;i<arrayUserInput.length;i++) {
				numberInputs[i] = Integer.parseInt(arrayUserInput[i]);
			}
			List<String> listSum = findTriplets(numberInArray, numberInputs);
			printListOfSumN(listSum);
		} catch(IOException ex) {
			System.out.println(ex);			
		}
	}

}

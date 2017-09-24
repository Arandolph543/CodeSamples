public class NumberPriority {

/*

*/

	public void OrderProductsByPriority(String[] productCodes) {
		String priArray[];
		String temp1Array[];
		String temp2Array[];
		String temp3Array[];
		int i = 0;
		int index = 0;
		int j = 0;
		int k = 0;
		int size = productCodes.length;
		
		while(size >= 0) {
			int priority = GetPriority(productCodes[index]);
			if(priority == 3) {
				temp1Array[i] = productCodes[index];
				i = i + 1;
				System.out.println("sd3gt: " + priArray[i].toString() + " EI: " + endIndex);
			} else if (priority == 2) {
				temp2Array[j] = productCodes[index];
				j = j + 1;
				System.out.println("sd2gt: " + priArray[i].toString() + " Ind: " + index);
			} else if (priority == 1) {
				temp3Array[k] = productCodes[index];
				k = k + 1;
				System.out.println("sd1gt: " + priArray[i].toString() + " Ind: " + index);
			}
			index++;
			size--;
		}
		priArray = temp1Array + temp2Array + temp3Array;
	}

	public static void main(String[] args) {
		string[] temp = {"sdfs2","sdfs2","sdfs2","sdfs2","sdfs2","sdfs2"};
		OrderProductsByPriority(temp);		
	}
}

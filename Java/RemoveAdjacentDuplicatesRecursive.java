public class RemoveAdjacentDuplicatesRecursive {

	static String removeAdjDuplicates(String phrase, int index, int n, String res) {
		if(index>=n) {
			if(n>=2&&(phrase.charAt(n-1)!=phrase.charAt(n-2))) {
				res += phrase.charAt(n-1);
			} else if(n==1) {
				res += phrase.charAt(n-1);
			}
			return res;
		}
		char ch = phrase.charAt(index);
		
		if(index<n-2&&index+1<n-1&&ch==phrase.charAt(index+1)) {
			while(index<n-1&&ch==phrase.charAt(index+1)) {
				index++;				
			}
		} else if(index<n-1&&ch!=phrase.charAt(index+1)) {
			res += phrase.charAt(index);
		}
		return removeAdjDuplicates(phrase, index+1, n, res);		
	}

	public static void main(String[] args) {
		String string = "messymisssolessomemessss";
		int n = string.length();
		char[] arr1 = removeAdjDuplicates(string, 0, n, "").toCharArray();
		char[] arr2 = removeAdjDuplicates(String.valueOf(arr1), 0, arr1.length, "").toCharArray();
		while(arr1.length!= arr2.length) {
			arr1 = removeAdjDuplicates(String.valueOf(arr2), 0, arr2.length,"").toCharArray();
			arr2 = removeAdjDuplicates(String.valueOf(arr1), 0, arr1.length,"").toCharArray();
		}
		System.out.println(String.valueOf(arr1));	
	}
}

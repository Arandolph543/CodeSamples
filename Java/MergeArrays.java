public class MergeArrays {


	static int[] mergeArray(int []a, int []b, int M ){
		int[] c = new int[M];
		int i = 0, j = 0,k = 0;
		while(i<a.length-1 && j<b.length-1) {
			if(a[i] < b[j]) { 
				c[k++] = a[i];
				i++;
			} else {
				c[k++] = b[j];
				j++;
			}
		}
		
		while(i<=a.length-1) {
			c[k++] = a[i++];
		}
		while(j<=b.length-1) {
			c[k++] = b[j++];
		}

		b = c;
		return b;
	}
	
	public static void main(String[] args) {
		int[] a = {3,5,6,9,12,14,18,20,25,28};
		int[] b = {30,32,34,36,38,40,42,44,46};
		int m = 19;
		int[] c = mergeArray(a,b,m);
		for(int i = 0;i<m;i++) {
			System.out.println(c[i]);
		}
	}
	
}
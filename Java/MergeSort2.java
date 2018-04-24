public class MergeSort2 {

	public static int[] mergeUtil(int[] arr, int l, int m, int r) {
		int[] mergedArray = new int[r-l];
		for(int i = l;i<r;i++) {
			if(arr[m] < arr[i]) {
				mergedArray[i] = arr[m];
				m++;
			}else {
				mergedArray[i] = arr[i];
			}
		}
		return mergedArray;	
	}

	static int[] sort(int[] arr, int l, int r) {
		int[] newArray = null;
		if(l<r) {
			int m = (r+l)/2;
			sort(arr, l, m);
			sort(arr, m+1, r);
			
			newArray = mergeUtil(arr, l, m, r);
		}
		return newArray;
	}


	public static void main(String[] args) {
		MergeSort2 mergeSort = new MergeSort2();
		int[] arr = {3, 4, 6, 2, 14, 0};
		arr = mergeSort.sort(arr, 0, arr.length-1);
		for(int i = 0;i< arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}



}
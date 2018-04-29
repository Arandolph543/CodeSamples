public class MergeSort2 {

	public static int[] mergeUtil(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int[] tempMergedArray1 = new int[m-l+1];
		int[] tempMergedArray2 = new int[r-m];
		
		
		for(int i = 0;i<n1;++i) 
			tempMergedArray1[i] = arr[l+i];
		for(int k =0;k<n2;++k)
			tempMergedArray2[k] = arr[m+k+1];
		
		int i = 0,
		k = 0;
		
		int j = l;
		while(i < n1 && k < n2) {
			if(tempMergedArray1[i] <= tempMergedArray2[k]) {
				arr[j] = tempMergedArray1[i];
				i++;
			}else {
				arr[j] = tempMergedArray2[k];
				k++;
			}
			j++;
		}
		
		while(i<n1) {
			arr[j] = tempMergedArray1[i];
			j++;
			i++;
		}
			
		while(k<n2) {
			arr[j] = tempMergedArray2[k];
			j++;
			k++;
		}
		
		return arr;	
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
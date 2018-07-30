public class LargestFigureHourGlass {

	static int largestHourGlass(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int largest = 0, tempSum = 0;
		for(int i =0;i<n;i++) {
			for(int h = 0;h<m;h++) {
				if(h+2 <m && i+2 < n && arr[i][h] > 0 && arr[i][h+2] > 0) {
					int i1 = i,i2 = i+1, m1 = h, m2 = h+2;
					System.out.println("Debug: " + arr[i][h] + " " + m2 + " " + i+2);
					while(i1<=i2+1 && m1<=m2) {
						if(!(i1 == i2 && h == m1) && !(i1 == i2 && h == m2)) {
							tempSum += arr[i1][m1];
							
						}
						i1++;
							m1++;
						System.out.println("Debug: adding " + arr[i][h] + " " + tempSum + " " + i1 + " " + m1);
						
					}
				}
				if(tempSum > largest) {
					largest = tempSum;
				}
			}
		}
		return largest;
	}

	public static void main(String[] arg) {
		int[][] arr2D  = new int[][]{{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,2,-4,-4},
		{0,0,0,0,-1,0},{0,0,0,-4,-4,-4}};
		System.out.println(largestHourGlass(arr2D));
	}
}

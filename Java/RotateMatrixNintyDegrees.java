import java.util.*;
public class RotateMatrixNintyDegrees {

	public int[][] rotate(int[][] inputMatrix, int N) {
		
		int n = inputMatrix.length;
		int m = inputMatrix[0].length;
		int[][] tempGrid = new int[m][n];
		for(int i = 0;i<n;i++) {
			for(int k = 0;k<m;k++) {
				tempGrid[i][k] = inputMatrix[k][n-i-1];
			}
		}
		return tempGrid;
	}
		
	public static void main(String[] args) {
		RotateMatrixNintyDegrees rmnd = new RotateMatrixNintyDegrees();
		int[][] matrix = {{1,4,5,6},
			{5,1,8,12},
				{9,16,26,7},
				{4,14,19,21}};
				
		matrix = rmnd.rotate(matrix, 4);
		System.out.println(Arrays.deepToString(matrix));
	}

}

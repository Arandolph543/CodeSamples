import java.lang.Integer;
public class MatrixMultiple {
	protected int[][] m;
	protected int[][] s;
	
	int multipleMatrices(int[] matrices) {
		
		int n = matrices.length - 1;
		int index = 0;
		int operationValue = 0;
		m = new int[n][n];
		s = new int[n][n];
		
		for(int j = 1;j < n;j++) {
			for(int k = 0;k < (n - j);k++) {
				index = k + j;
				m[k][index] = Integer.MAX_VALUE;
				for(int l = k;l < index;l++) {
					operationValue = m[k][l] + m[l+1][index] + matrices[k]*matrices[l+1]*matrices[index+1];
					if(operationValue < m[k][index]) {
						m[k][index] = operationValue;
						s[k][index] = l;
					}
				}
			}
		}
		return operationValue;
	}

	public static void main(String[] args) {
		MatrixMultiple matrix = new MatrixMultiple();
		int[] matrices = {10, 30, 40, 20, 50};
		System.out.println(matrix.multipleMatrices(matrices));
	}

}

public class SpiralMatrixTraversal {


	static void printTraversalMatrix(int[][] mat) {
		//if index reaches edge nintey degree rotation
		int n = mat.length;
		for(int i = 0;i< mat.length;i++) {
			for(int j = 0;j < mat[0].length;j++) { 
				System.out.println(mat[i][n-i-1]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrice = {{3,4,5,2},{7,8,9,0},{1,3,5,3}};
		printTraversalMatrix(matrice);

	}
}

 /* In a matrice of 2x2 find the largest square in bit.
 Author: April Randolph
 Date: 06/21/20*/ 
 
 class MaximalSquareRectangle {
	public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = 0;
        if(col==0 && row-1<0) {
            return 0;
        }
        if(row>=0 && (matrix[row-1]!=null || matrix[row]!=null)){
            col = matrix[0].length;
        } 
        int rectangle = 0;
        if((row==1 && col==1)) {
           if(matrix[row-1][col-1]=='1') return 1;
        } 
        int[][] tdp = new int[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix.length;i++) {
            for(int r = 0;r<matrix[0].length;r++) {
                if(i==0) {
                    tdp[i][r] = matrix[i][r] == '1' ? 1 : 0;
                } else {
                    tdp[i][r] = matrix[i][r] == '1' ? (tdp[i-1][r]+1) : 0;
                }
                int min = tdp[i][r];
                for(int k = r;k>=0;k--) {
                    if(min==0) break;
                    if(tdp[i][k]<min)  min=tdp[i][k];
                    rectangle = Math.max(rectangle, min * (r-k+1));
                }
            }
        }
        return rectangle;
    }
	
	public static void main (String[] args) {
		char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		System.out.println("Matrix: ");
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix[0].length;j++) {
				if(j==0 && i>=1)
					System.out.print("\n");
				System.out.print(matrix[i][j] + " ");
			}
		}
		MaximalSquareRectangle msrClass = new MaximalSquareRectangle();
		System.out.println("\n" + msrClass.maximalRectangle(matrix));		
	}
 }
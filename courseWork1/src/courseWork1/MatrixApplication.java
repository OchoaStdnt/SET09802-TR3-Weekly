/*
 * Created by Angel Ochoa
 */

package courseWork1;



public class MatrixApplication {

	public static void main(String[] args) {
		
		// variables
		final int MIN_ROWS = 3;
		final int MAX_ROWS = 10;
		final int MIN_COLS = 3;
		final int MAX_COLS = 10;
		int nRows = 0; //number of Rows
		int nCols = 0; //number of Columns
		
		
		//prompt user for nRows and nCols
		nRows = MatrixOps.getRows(MIN_ROWS, MAX_ROWS);
		nCols = MatrixOps.getCols(MIN_COLS, MAX_COLS);
		
		//build array for matrix
		int[][] matrixApp = new int[nRows][nCols]; //2D matrix array
		
		
		
		
		
		
		
		//TEST only 
		for(int rloop = 0; rloop < matrixApp.length; rloop++) {
			for (int cloop = 0; cloop < matrixApp[rloop].length; cloop++) {
				System.out.print(matrixApp[rloop][cloop]+"\t");
				
			}
			System.out.print("\n");
		}
		
		
		
		
		
		

	}//end main

}//end class

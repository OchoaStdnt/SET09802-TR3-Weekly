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
		int averageOfAllInArray;
		
		
		//prompt user for nRows and nCols
		nRows = MatrixOps.getRows(MIN_ROWS, MAX_ROWS);
		nCols = MatrixOps.getCols(MIN_COLS, MAX_COLS);
		
		//build array for matrix
		int[][] matrixApp = new int[nRows][nCols]; //2D matrix array
		
		//array to store the averages of the rows
		int[] rowAverages = new int[matrixApp.length];
		
		//array to store the averages of the columns
		int[] columnAverages = new int[matrixApp[0].length]; //using 0 since there will alway be a row
		
		//populate array with random Numbers
		MatrixOps.populateArray(matrixApp);
		
		//get average of each row of the array
		MatrixOps.getAverageRows(matrixApp, rowAverages);
		
		//get average of each column of the array
		MatrixOps.getAverageColumns(matrixApp, columnAverages);
		
		//average of all the values in the array
		averageOfAllInArray = MatrixOps.getAverageOfArray(matrixApp);
		
		
		
		
		
		//TEST only 
		for(int rloop = 0; rloop < matrixApp.length; rloop++) {
			for (int cloop = 0; cloop < matrixApp[rloop].length; cloop++) {
				System.out.print(matrixApp[rloop][cloop]+"\t");
				
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for(int loop = 0; loop < rowAverages.length; loop++) {
				System.out.print(rowAverages[loop]+"\t");
		}
		System.out.print("\n");
		for(int loop = 0; loop < columnAverages.length; loop++) {
			System.out.print(columnAverages[loop]+"\t");
		}
		System.out.print("\n");
		System.out.print(averageOfAllInArray);
		
		
		
		

	}//end main

}//end class

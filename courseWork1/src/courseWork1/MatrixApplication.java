/*
 * Created by Angel Ochoa
 * will add more comments
 */

package courseWork1;



public class MatrixApplication {

	public static void main(String[] args) {
		
		/*
		 * -----------------START Part 1----------------
		 * Create a matrix of integer numbers with N rows and M columns (specified by the user,
		 * such that 3 <= N <=10, 3 <= M <= 10) and fill it up by random integers ranging
		 * from 0 to 1000 such that odd rows contain only odd numbers while even rows contain
		 * only even numbers.
		 */
		
		// variables
		final int MIN_ROWS = 3;
		final int MAX_ROWS = 10;
		final int MIN_COLS = 3;
		final int MAX_COLS = 10;
		String promptForRows;
		int nRows = 0; //number of Rows
		int nCols = 0; //number of Columns
		
		
		//prompt user for nRows and nCols
		promptForRows = "Please enter a number for rows between "+MIN_ROWS+" and "+MAX_ROWS;
		nRows = MatrixOps.promptAndValidate(MIN_ROWS, MAX_ROWS, promptForRows);
		
		promptForRows = "Please enter a number for columns between "+MIN_COLS+" and "+MAX_COLS;
		nCols = MatrixOps.promptAndValidate(MIN_COLS, MAX_COLS, promptForRows);
		
		//build 2D matrix array
		int[][] matrixApp = new int[nRows][nCols];
		int[][] matrixAppBak = new int[nRows][nCols]; //to store a copy of the original array
		
		//populate array with random Numbers. odd rows will have only odd numbers and even numbers will have only even numbers
		MatrixOps.populateArray(matrixApp);
		
		//make a copy of the array (this is just for backup purposes of original values)
		MatrixOps.copy2DArray(matrixApp, matrixAppBak);
		
		
		
		//TEST print matrix
		MatrixOps.print2DArray(matrixApp);
		
		//------------------END part 1--------------------
		
		/*
		 * START part 2
		 * Compute the average of each row and each column and the average of the whole matrix.
		 */
		
		//variables and arrays
		float averageOfAllInArray;
		float[] rowAverages = new float[nRows]; //array to store the averages of the rows
		float[] columnAverages = new float[nCols]; //array to store the averages of the columns. Using 0 since there will always be a row
		
		//get average of each row of the array and store
		MatrixOps.getAverageRows(matrixApp, rowAverages);
		
		//get average of each column of the array and store
		MatrixOps.getAverageColumns(matrixApp, columnAverages);
		
		//average of all the values in the array
		averageOfAllInArray = MatrixOps.getAverageOfArray(matrixApp);
		
		/*
		 * END part 2
		 */
		
		/*
		 * START part 3
		 * Find the row and the column with the second largest average.
		 */
		
		//variables
		int rowSecondLargest = 0;
		int colSecondLargest = 0;
		
		//get the second largest for the row and column
		rowSecondLargest = MatrixOps.getSecondLargest(rowAverages); //passing array that keeps track of averages for rows
		colSecondLargest = MatrixOps.getSecondLargest(columnAverages); //passing array that keeps track of averages for columns
		
		/*
		 * END part 3
		 */
		
		/*
		 * START part 4
		 * Modify the cells in the matrix as follows:
		 * 
		 * If the value in the cell is larger than the average of the 
		 * corresponding column and larger than the average of the corresponding row,
		 * then change the value of that cell to +1.
		 * 
		 * If the value in the cell is smaller than the average
		 * of the corresponding column and smaller than the average of the corresponding row,
		 * then change the value of that cell to -1.
		 * 
		 * Otherwise, change the value of the corresponding cell to 0 (zero).
		 */
		
		//modify the values in the 2D array
		MatrixOps.modify2DArray(matrixApp, rowAverages, columnAverages);
		
		/*
		 * END part 4
		 */
		
		/*
		 * START part 5
		 * Print out the number of cells in the matrix containing the values -1, +1 and 0.
		 */
		
		MatrixOps.printMod2DArray(matrixApp); //this is just to test
		//MatrixOps.printModArrayCount();
		
		/*
		 * END part 5
		 */
		
		
		/*
		//TEST print matrix
		for(int rloop = 0; rloop < matrixApp.length; rloop++) {
			for (int cloop = 0; cloop < matrixApp[rloop].length; cloop++) {
				System.out.print(matrixApp[rloop][cloop]+"\t");
				
			}
			System.out.print("\n");
		}
		
		//averages
		System.out.print("\n");
		for(int loop = 0; loop < rowAverages.length; loop++) {
			if(rowAverages[loop] % 1 == 0) {
				System.out.printf("%.0f\t", rowAverages[loop]);
			}else {
				System.out.printf("%.1f\t", rowAverages[loop]);
			}
		}
		System.out.print("\n");
		for(int loop = 0; loop < columnAverages.length; loop++) {
			if(columnAverages[loop] % 1 == 0) {
			System.out.printf("%.0f\t", columnAverages[loop]);
			} else
			{
				System.out.printf("%.1f\t", columnAverages[loop]);
			}
		}
		System.out.print("\n");
		if(averageOfAllInArray % 1 == 0) {
			System.out.printf("%.0f", averageOfAllInArray);
		}else {
			System.out.printf("%.1f", averageOfAllInArray);
		}
		
		System.out.print("\n");
		System.out.print("\n");
		//row and column with second largest
		System.out.print("row with second largest is " +rowSecondLargest +"\n");
		System.out.print("column with second largest is " +colSecondLargest +"\n");
		
		//reference for floats
		//System.out.printf("%.1f\n", value2)
		*/
		
		
		

	}//end main

}//end class

/*
 * Created by Angel Ochoa
 * JavaDoc lines pending
 */

package courseWork1;

import javax.swing.JOptionPane;

public class MatrixApplication {

	public static void main(String[] args) {
		
		/*
		 * -----------------START Part 1-----------------
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
		//int[][] modOriginalMatrixApp = new int [nRows][nCols];
		
		//populate array with random Numbers. odd rows will have only odd numbers and even numbers will have only even numbers
		MatrixOps.populateArray(matrixApp);
		
		//make a copy of the array
		MatrixOps.copy2DArray(matrixApp, matrixAppBak);
		
		//make another copy to add the averages later on
		//MatrixOps.copy2DArray(matrixApp, modOriginalMatrixApp);
		
		//-----------------END part 1-----------------
		
		/*
		 * -----------------START part 2-----------------
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
		
		//add the averages to a copy of the array for display purposes
		float[][] matrixAppWithAverages = new float[nRows+1][nCols+1];
		MatrixOps.addAveragesToArray(matrixAppBak, matrixAppWithAverages, rowAverages, columnAverages, averageOfAllInArray);
		
		//-----------------END part 2-----------------
		
		/*
		 * -----------------START part 3-----------------
		 * Find the row and the column with the second largest average.
		 */
		
		//variables
		int positionOfRowSecondLargest = 0;
		int positionOfColSecondLargest = 0;
		
		//get the second largest for the row and column
		positionOfRowSecondLargest = MatrixOps.getSecondLargest(rowAverages); //passing array that keeps track of averages for rows
		positionOfColSecondLargest = MatrixOps.getSecondLargest(columnAverages); //passing array that keeps track of averages for columns
		
		//-----------------END part 3-----------------
		
		/*
		 * -----------------START part 4-----------------
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
		
		//-----------------END part 4-----------------
		
		/*
		 * -----------------START part 5-----------------
		 * Print out the number of cells in the matrix containing the values -1, +1 and 0.
		 */
		
		//array to store count of -1, +1 and 0
		final int VALUECOUNTARRAY = 3;
		int[] valueCounts = new int [VALUECOUNTARRAY]; //this will store the counts for -1 , +1 and 0 respectively.
		
		//count values of the modified array that contains only -1, 1, and 0 and store in array
		MatrixOps.getValueCounts (matrixApp, valueCounts);
		
		/*     ENABLE ONLY IF THE PRINT OUT OF THE LAST PART IS NEEDED
		//Construct print out the counts
		String outputValueCounts = MatrixOps.constructPrintValueCounts(valueCounts);
		JOptionPane.showMessageDialog(null, outputValueCounts, "Results of Modified Matrix", JOptionPane.INFORMATION_MESSAGE);
		*/
		
		//-----------------END part 5-----------------
		
		/*
		 * -----------------START part 5 v2-----------------
		 */
		
		//print all the gathered information
		String printAll = MatrixOps.constructPrintAll(matrixAppBak, matrixAppWithAverages, rowAverages, columnAverages, averageOfAllInArray, positionOfRowSecondLargest, positionOfColSecondLargest, matrixApp, valueCounts);
		JOptionPane.showMessageDialog(null, printAll, "All gathered information in order", JOptionPane.INFORMATION_MESSAGE);
		
		//-----------------END part 5 v2-----------------
		
	}//end main

}//end class

//Created by Angel Ochoa - MC: 40688673
/*
 * Detailed information of what each task of the code is at the bottom of this class file
 */

package courseWork1;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane; //for GUI
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Main Application for Coursework 1.
 * <p>
 * Module Title: Software Development<br/>
 * Module Code: SET09802 2024-5 TR3 001<br/>
 * Lecturer: Professor Tomas Horvath<br/>
 * </p>
 * <p>
 * This application will generate 2D array based on user input and will then
 * perform several tasks. All tasks completed will be displayed with {@code JOptionPane}
 * to the user.
 * </p>
 * @author Angel Ochoa - MC: 40688673
 * @version 1.0 14/07/2025
 */
public class MatrixApplication {

	/**
	 * This construction has been created only to prevent it from showing on the JavaDoc file.
	 * @hidden
	 */
	public MatrixApplication() {
		//constructor to hide from javadoc only
	}
	
	/**
	 * Start of the MatrixApplication.
	 * @param args Command-line arguments (not used).
	 */
	public static void main(String[] args) {
		
		//-----------------START Part 1----------------- 
		
		// variables
		final int MIN_ROWS = 3; //the minimum number of Rows allowed
		final int MAX_ROWS = 10; //the maximum number of Rows allowed
		final int MIN_COLS = 3; //the minimum number of Columns allowed
		final int MAX_COLS = 10; //the maximum number of Rows allowed
		String promptForRows; //stores the prompt that will be used to ask user for number of rows/columns
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
		
		//make a copy of the array
		MatrixOps.copy2DArray(matrixApp, matrixAppBak);
		
		//-----------------START part 2-----------------
		
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
		float[][] matrixAppWithAverages = new float[nRows+1][nCols+1]; //added +1 since this array will have an extra column and row
		MatrixOps.addAveragesToArray(matrixAppBak, matrixAppWithAverages, rowAverages, columnAverages, averageOfAllInArray);
		
		//-----------------START part 3-----------------
		
		//variables
		int RowSecondLargestPosition = 0; //row number of value
		int ColSecondLargestPosition = 0; //column number of value
		
		//get the second largest for the row and column
		RowSecondLargestPosition = MatrixOps.getSecondLargest(rowAverages) + 1; //adding plus one to indicate actual row #
		ColSecondLargestPosition = MatrixOps.getSecondLargest(columnAverages) + 1; //adding plus one to indicate actual column #
		
		//-----------------START part 4-----------------
		
		//modify the values in the 2D array with -1, 1, and 0s
		MatrixOps.modify2DArray(matrixApp, rowAverages, columnAverages);
		
		//-----------------START part 5-----------------
		
		//array to store count of -1, +1 and 0
		final int VALUECOUNTARRAY = 3;
		int[] valueCounts = new int [VALUECOUNTARRAY]; //this will store the counts for -1 , +1 and 0 respectively.
		String[][] matrixAppMod = new String[nRows][nCols]; //string array to add + sign to positive 1 for display purpose
		
		//copy matrixApp array into a String matrixAppMod this is to add + sign to positive numbers
		MatrixOps.copy2DArrayAndAppendSign(matrixApp, matrixAppMod);
		
		//count values of the modified array that contains only -1, 1, and 0 and store in array
		MatrixOps.getValueCounts (matrixApp, valueCounts);
		
		//construct output
		String output;
		Boolean isRow = true; //for use with constructPrintAverage()
		Boolean isCol = false; //for use with constructPrintAverage()
		
		output = "2D array based on the users input number of Rows and Columns with randomly generated numbers\nNOTE: Odd rows have odd numbers only and Even Rows have Even numbers only:\n\n"
				+ MatrixOps.constructPrint2DArray(matrixAppBak) +"\n\n" //prints int array
				+ "The average of each row and column are:\n\n"
				+ MatrixOps.constructPrintAverage(rowAverages, isRow) +"\n"
				+ MatrixOps.constructPrintAverage(columnAverages, isCol) +"\n"
				+ String.format("The average of all Values in the 2D array is: %.1f\n\n\n", averageOfAllInArray)
				+ "Array with row averages added to the end of each row, column averages at the bottom,\n"
				+ "and the overall average at the bottom-right corner:\n\n"
				+ MatrixOps.constructPrint2DArray(matrixAppWithAverages) +"\n\n"  //prints float array
				+ "The second largest average of the rows is located in row " +RowSecondLargestPosition +"\n"
				+ "The second largest average of the columns is located in column " +ColSecondLargestPosition +"\n\n\n"
				+ "Modified array with values -1, 1, and 0:\n\n"
				+ MatrixOps.constructPrint2DArray(matrixAppMod) +"\n" //prints String array
				+ "Number of cells in the matrix containing the values -1, +1 and 0:\n\n"
				+ MatrixOps.constructPrintValueCounts(valueCounts);
		
		// better format for JOptionPane output display
		JTextArea textArea = new JTextArea(output); //puts output string in a text area
		textArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12)); //sets font
		textArea.setEditable(false); //makes the text area read only
		textArea.setCaretPosition(0); //makes the starting position of the txt area always start at the top
		JScrollPane scrollPane = new JScrollPane(textArea); //add the scroll to the text area
		
		//modify size of JOption prompt
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //get monitor screen size
		int sWidth = (int) (screenSize.width * 0.5);   // 50% of screen width
		int sHeight = (int) (screenSize.height * 0.5); // 50% of screen height
		scrollPane.setPreferredSize(new Dimension(sWidth, sHeight)); //limit the size of the pane
		
		//print output
		JOptionPane.showMessageDialog(null, scrollPane, "All gathered information in order", JOptionPane.INFORMATION_MESSAGE);
	}//end main

}//end class

/* 
 * Coursework 1 tasks
 * 
 * ----------PART 1------------
 * Create a matrix of integer numbers with N rows and M columns (specified by the user,
 * such that 3 <= N <=10, 3 <= M <= 10) and fill it up by random integers ranging
 * from 0 to 1000 such that odd rows contain only odd numbers while even rows contain
 * only even numbers.
 *
 * ----------PART 2------------
 * Compute the average of each row and each column and the average of the whole matrix.
 * 
 * ----------PART 3------------
 * Find the row and the column with the second largest average.
 * 
 * ----------PART 4------------
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
 * 
 * ----------PART 5------------
 * Print out the number of cells in the matrix containing the values -1, +1 and 0.
 * 
 */

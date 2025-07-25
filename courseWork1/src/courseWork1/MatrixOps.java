//Created by Angel Ochoa - MC: 40688673
package courseWork1;

import javax.swing.JOptionPane; //for GUI
import java.util.Random; //for random number generation

/**
 * Class containing methods for generating arrays, mathematical 
 * calculations, and constructing output data for main class {code MatrixApplication()}.
 * @author Angel Ochoa - MC: 40688673
 */
public class MatrixOps {

	/**
	 * This construction has been created only to prevent it from showing on the JavaDoc file.
	 * @hidden
	 */
	public MatrixOps () {
		//constructor to hide from Javadoc only
	}
	
	/**
	 * Prompts the user to enter an integer between {@code minNum} and {@code maxNum},
     * validating that it is an integer within the specified range.
	 * @param minNum The minimum accepted integer
	 * @param maxNum The maximum accepted integer
	 * @param prompt The message to display when prompting user
	 * @return The value entered by user once validated
	 */
	public static int promptAndValidate(int minNum, int maxNum, String prompt) {
		
		//variables
		String inputToParse;
		int userInput = 0; //this will store the value of the user
		boolean validateInt = false;
		
		
		while(validateInt == false) { //this loop will check if the string has an Integer when parsing
		
			try {	
			//prompt user for input
			inputToParse = JOptionPane.showInputDialog(prompt);
			userInput = Integer.parseInt(inputToParse);
			
			//validate integer
			while(userInput < minNum || userInput > maxNum) {
				
				inputToParse = JOptionPane.showInputDialog("Number must be between "+minNum+" and "+maxNum);
				userInput = Integer.parseInt(inputToParse);
				
			}
			
			//stop loop
			validateInt = true;
			
			}catch (NumberFormatException e) { //this validates if the entered value is an Integer
				JOptionPane.showMessageDialog(null, "A whole number must be entered, try again.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			}//end try
		
		
		}//end while
		
		return userInput;
		
	}//end promptAndValidate
	
	/**
	 * This populates an integer 2D array with random numbers. For rows that are even(row #2) 
	 * it populates with just even numbers and if the row is an odd (row #1)
	 * it populates with odd numbers only.
	 * @param array integer array that will be populated with random #s
	 */
	public static void populateArray(int[][] array) {
		
		//initiate Random generator
		Random GenNum = new Random();
		
		//populate array with random numbers. odd rows will have only odd numbers and even rows will have only even numbers
		for(int rLoop = 0; rLoop < array.length; rLoop++) {
			
			for(int cLoop = 0; cLoop < array[rLoop].length; cLoop++) {
				//variable to store random number
				int rNum;
				
				//check if row is even or odd
				if ((rLoop + 1) % 2 == 0) { //add + 1 to rLoop so that the index 0 is row 1 then checks if its an even row. anything that is divided by 2 and gives a reminder of 0 is an even number
					rNum = GenNum.nextInt(501) * 2; //this generates even Numbers
					
				}else {
					rNum = GenNum.nextInt(500) * 2 + 1; //this generates odd Numbers
				}
				
				//= GenNum.nextInt(1000); //generate a random number between 0-1000
				array[rLoop][cLoop] = rNum;
			}//end second for loop
			
		}//end first for loop
		
	}//end populateArray
	
	/**
	 * Copies content of an integer 2D array to another integer 2D array.
	 * @param originalArray Array to be copied
	 * @param bakOfArray Copy of {@code originalArray}
	 */
	public static void copy2DArray(int[][] originalArray, int[][] bakOfArray) {
		
		for(int rLoop = 0; rLoop < originalArray.length; rLoop++) {
			for(int cLoop = 0; cLoop < originalArray[rLoop].length; cLoop++) {
				bakOfArray[rLoop][cLoop] = originalArray[rLoop][cLoop];
			}//end second for loop
		}//end first for loop
		
	}//end copy2DArray
	
	/**
	 * Computes the average of each row and stores them in a float array.
	 * @param array Array containing values to get average
	 * @param array2 Array where the averages will be stored
	 */
	public static void getAverageRows(int[][] array, float[] array2) {
		
		//variables
		int sumOfValues = 0;
		float averageOfValues;
		
		for(int rLoop = 0; rLoop < array.length; rLoop++) {
			for(int cLoop = 0; cLoop < array[rLoop].length; cLoop++) {
				sumOfValues = sumOfValues + array[rLoop][cLoop];
				
			}
			averageOfValues = (float) sumOfValues / array[0].length; //divide by number of columns
			array2[rLoop] = averageOfValues;
			sumOfValues = 0; //reset sum of values for use in second loop
		}//end first for loop
		
	}//end getAverageRows
	
	/**
	 * Computes the average of each column and stores them in a float array.
	 * @param array Array containing values to get average
	 * @param array2 Array where the averages will be stored
	 */
	public static void getAverageColumns(int[][] array, float[] array2) {
		
		//variables
		int sumOfValues = 0;
		float averageOfValues;
		
		for(int cLoop = 0; cLoop < array[0].length; cLoop++) {
			for(int rLoop = 0; rLoop < array.length; rLoop++) {
				sumOfValues =  sumOfValues + array[rLoop][cLoop];
			}//end second for loop
			averageOfValues = (float) sumOfValues / array.length; //divide by number of rows
			array2[cLoop] = averageOfValues;
			sumOfValues = 0; //reset sum of values for use in second loop
		}//end first for loop
		
	}//end getAverageColumns
	
	/**
	 * Computes the average of all values in an integer 2D array and returns the average
	 * @param array Array containing values to get average
	 * @return The average of all values in array
	 */
	public static float getAverageOfArray(int[][] array) {
		//variables
		int sumOfValues = 0;
		int numOfValues = 0;
		float averageOfValues;
		
		for(int rLoop = 0; rLoop < array.length; rLoop++) {
			for(int cLoop = 0; cLoop < array[rLoop].length; cLoop++) {
				sumOfValues = sumOfValues + array[rLoop][cLoop];
				numOfValues++; //keep count of values being added
			}//end second loop
		}//end first for loop
		averageOfValues = (float) sumOfValues / numOfValues;
		return averageOfValues;
	}//end getAverageOfArray
	
	/**
	 * Copies content of an integer 2D Array and adds in row, column and total averages.
	 * @param originalArray Original array to be copied
	 * @param arrayWithAverages a float array that will containing values of {@code originalArray} with extra row and column
	 * @param rowAverages Row averages to be added to {@code arrayWithAverages}
	 * @param colAverages Column averages to be added to {@code arrayWithAverages}
	 * @param allAverage Averages of all values of an Array to be added to {@code arrayWithAverages}
	 */
	public static void addAveragesToArray(int[][] originalArray, float[][] arrayWithAverages, float[] rowAverages, float[] colAverages, float allAverage) {
		
		//variables
		int rows = originalArray.length;
		int cols = originalArray[0].length;
		
		for(int rLoop = 0; rLoop <= rows; rLoop++) { //using <= since the 2D array that will take the averages has 1 more row
			for(int cLoop = 0; cLoop <= cols; cLoop++) { //using <= since the 2D array that will take the averages has 1 more column
				if(rLoop < rows && cLoop < cols) {
					arrayWithAverages[rLoop][cLoop] = originalArray[rLoop][cLoop]; 
				}else if (rLoop < rows && cLoop == cols){
					arrayWithAverages[rLoop][cLoop] = rowAverages[rLoop];
				}else if(rLoop == rows && cLoop < cols) {
					arrayWithAverages[rLoop][cLoop] = colAverages[cLoop];
				}else if(rLoop == rows && cLoop == cols) {
					arrayWithAverages[rLoop][cLoop] = allAverage;
				}
			}//end second for loop
			
		}//end first for loop
		
	}//end addAveragesToArray
	
	/**
	 * Checks a float array for the second largest value and returns the index location of the value.
	 * @param array Array containing values
	 * @return The index number of the second largest
	 */
	public static int getSecondLargest(float[] array) {
		
		float maxValue = 0;
		float secondMaxValue = 0;
		int posNumber = 0;
		
		for(int loop = 0; loop < array.length; loop++) {
			if (array[loop] > maxValue) {
				secondMaxValue = maxValue;
				maxValue = array[loop];
			}else if (array[loop] > secondMaxValue && array [loop] != maxValue) { //using else if to validate two conditions
				secondMaxValue = array[loop];
			}
		}//end for loop
		
		//find the position Number
		for(int loop = 0; loop < array.length; loop++) {
			if (array[loop] == secondMaxValue) {
				posNumber = loop;
			}
		}
		
		return posNumber; //return index #
	
	}//end getRowSecondLargest
	
	/**
	 * Modifies an integer 2D array by replacing values with -1, 1, and 0 based on row and columns averages.
	 * @param twoDArray The array to be modified
	 * @param rowAverages Array with row averages to check
	 * @param colAverages Array with column averages to check
	 */
	public static void modify2DArray(int[][] twoDArray, float[] rowAverages, float[] colAverages) {
		
		for(int rLoop = 0; rLoop < twoDArray.length; rLoop++) {
			for(int cLoop = 0; cLoop < twoDArray[rLoop].length; cLoop++) {
				if(twoDArray[rLoop][cLoop] > rowAverages[rLoop] && twoDArray[rLoop][cLoop] > colAverages[cLoop]) {
					twoDArray[rLoop][cLoop] = 1;
				}else if (twoDArray[rLoop][cLoop] < rowAverages[rLoop] && twoDArray[rLoop][cLoop] < colAverages[cLoop]) {
					twoDArray[rLoop][cLoop] = -1;
				}else {
					twoDArray[rLoop][cLoop] = 0;
				}
			}//end second for loop
		}//end first for loop
		
	}//end modify2DArray
	
	/**
	 * Copies content of an integer 2D array to a String 2D array and appends + to positive numbers.
	 * @param originalArray Array to be copied
	 * @param stringArray Copy of {@code originalArray} with + appended to positive numbers
	 */
	public static void copy2DArrayAndAppendSign(int[][] originalArray, String[][] stringArray) {
		
		for(int rLoop = 0; rLoop < originalArray.length; rLoop++) {
			for(int cLoop = 0; cLoop < originalArray[rLoop].length; cLoop++) {
				if(originalArray[rLoop][cLoop] > 0) {
				stringArray[rLoop][cLoop] = "+" +String.valueOf(originalArray[rLoop][cLoop]);
				} else {
				stringArray[rLoop][cLoop] = String.valueOf(originalArray[rLoop][cLoop]);
				}
			}//end second for loop
		}//end first for loop
		
	}//end copy2DArray
	
	/**
	 * Check a 2D array for values equal to -1, 1 and 0 and stores the count of each on an integer array.
	 * @param arrayToCheck The array with the values to check
	 * @param arrayToTrack Array to store the counts
	 */
	public static void getValueCounts (int[][] arrayToCheck, int[] arrayToTrack) {
		
		for(int rLoop = 0; rLoop < arrayToCheck.length; rLoop++) {
			for(int cLoop = 0; cLoop < arrayToCheck[rLoop].length; cLoop++) {
				if(arrayToCheck[rLoop][cLoop] == -1) {
					arrayToTrack[0]++;
				}else if(arrayToCheck[rLoop][cLoop] == 1) {
					arrayToTrack[1]++;
				}else {
					arrayToTrack[2]++;
				}
			}//end second loop
			
		}//end first for loop
		
	}//end getValueCounts
	
	/**
	 * Constructs a String with the counts for -1, 1 and 0 found in an integer array
	 * @param arrayWithCounts Array with counts
	 * @return string to output
	 */
	public static String constructPrintValueCounts(int[] arrayWithCounts) {
		
		//variables
		String output = "The number of cells with values -1 is " +arrayWithCounts[0] +"\n"
				+"The number of cells with values +1 is " +arrayWithCounts[1] +"\n"
				+"The number of cells with value 0 is " +arrayWithCounts[2];
		//print the output
		return output;
		//JOptionPane.showMessageDialog(null, output, "Results of Modified Matrix", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Constructs a String to display contents of a integer 2D array
	 * @param twoDArray Array with values
	 * @return string with 2D array for output
	 */
	public static String constructPrint2DArray(int[][] twoDArray) {
		
		//initialize output
		String output = "";
		
		//construct output 
		for (int rLoop = 0; rLoop < twoDArray.length; rLoop++) {
			output = output + "|";
			for (int cLoop = 0; cLoop < twoDArray[rLoop].length; cLoop++){
				output = output + String.format("  %-4d |", twoDArray[rLoop][cLoop]);
			}//end second for loop
			output = output + "\n";
		}//end first for loop
		
		return output;
	}
	
	/**
	 * Constructs a String to display contents of a String 2D array
	 * @param twoDArray Array with values
	 * @return string with 2D array for output
	 */
	public static String constructPrint2DArray(String[][] twoDArray) {
		
		//initialize output
		String output = "";
		
		//construct output 
		for (int rLoop = 0; rLoop < twoDArray.length; rLoop++) {
			output = output + "|";
			for (int cLoop = 0; cLoop < twoDArray[rLoop].length; cLoop++){
				output = output + String.format("  %-3s |", twoDArray[rLoop][cLoop]);
			}//end second for loop
			output = output + "\n";
		}//end first for loop
		
		return output;
	}
	
	/**
	 * Constructs a String to display contents of a float 2D array.
	 * @param twoDArray Array with values
	 * @return string with 2D array for output
	 */
	public static String constructPrint2DArray(float[][] twoDArray) {
		
		//initialize output
		String output = "";
		
		//construct output 
		for (int rLoop = 0; rLoop < twoDArray.length; rLoop++) {
			output = output + "|";
			for (int cLoop = 0; cLoop < twoDArray[rLoop].length; cLoop++){
				if(twoDArray[rLoop][cLoop] % 1 == 0) {
				output = output + String.format("   %-7.0f|", twoDArray[rLoop][cLoop]);
				}else {
					output = output + String.format("   %-7.1f|", twoDArray[rLoop][cLoop]);
				}
			}//end second for loop
			output = output + "\n";
		}//end first for loop
		
		return output;
	}
	
	/**
	 * Constructs a String to display values of a float array. String construction requires to state if the array is for rows or columns.
	 * @param arrayOfAverages array that has the average values
	 * @param isRow if true then String will be constructed for rows. If false string will be constructed for columns
	 * @return string to display averages for rows or columns
	 */
	public static String constructPrintAverage(float[] arrayOfAverages, Boolean isRow) {
		
		//initialize output
		String output = "";
		String isRowOrCol; 
		int positionNum = 1;
		
		if(isRow == true) {
			isRowOrCol = "Row";
		}else {
			isRowOrCol = "Column";
		}
		
		for(int loop = 0; loop < arrayOfAverages.length; loop++) {
			if(arrayOfAverages[loop] % 1 == 0) {
			output = output + String.format("Average of " +isRowOrCol +" #" +positionNum +" is %.0f\n", arrayOfAverages[loop]);
			}else {
				output = output + String.format("Average of " +isRowOrCol +" #" +positionNum +" is %.1f\n", arrayOfAverages[loop]);
			}
			positionNum++;
		}
		
		return output;
		
	}//end constructPrintAverage
	
}//end class


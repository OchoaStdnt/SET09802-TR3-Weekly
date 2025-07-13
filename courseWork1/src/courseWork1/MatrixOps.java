package courseWork1;

import javax.swing.JOptionPane;
import java.util.Random;

public class MatrixOps {

	/*
	 * This prompts user to enter an integer between a minimum value and a max value 
	 * and validates that its an integer before returning the value
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
	
	/*
	 * This populates an array with random numbers. for rows that are even(row #2) it populates with just
	 * even numbers. if the row is an odd (row #1) it populates with odd numbers only.
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
	
	/*
	 * This copies each value of an array and stores it on another array
	 * THIS IS ONLY FOR BACKUP purposes
	 */
	public static void copy2DArray(int[][] originalArray, int[][] bakOfArray) {
		
		for(int rLoop = 0; rLoop < originalArray.length; rLoop++) {
			for(int cLoop = 0; cLoop < originalArray[rLoop].length; cLoop++) {
				bakOfArray[rLoop][cLoop] = originalArray[rLoop][cLoop];
			}//end second for loop
		}//end first for loop
		
	}//end copy2DArray
	
	
	/*
	 * Computes the average of each row and stores them in an array
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
	
	/*
	 * Computes the average of each column and stores them in an array
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
	
	/*
	 * Computes the average of all values in the 2D array and returns the average
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
	
	/*
	 * Checks an array for the second largest value and returns the position of the value
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
		
		return posNumber + 1; //adds 1 to state the position number
	
	}//end getRowSecondLargest
	
	/*
	 * Modifies an array by replacing values with -1, 1, and 0 based on row and columns averages
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
	
	/*
	 * Checks the modified array and tracks how many -1, 1 and 0 and stores the count of each on an array
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
	
	/*
	 * Constructs the counts for -1, 1 and 0 found in an array
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
	
	/*
	 * Constructs a 2D array
	 */
	//print a 2DArray
	public static String constructPrint2DArray(int[][] twoDArray) {
		
		//initialize output
		String output = "";
		
		//construct output 
		for (int rLoop = 0; rLoop < twoDArray.length; rLoop++) {
			output = output + "|";
			for (int cLoop = 0; cLoop < twoDArray[rLoop].length; cLoop++){
				output = output + String.format("%-7d|", twoDArray[rLoop][cLoop]);
			}//end second for loop
			output = output + "\n";
		}//end first for loop
		
		return output;
		//JOptionPane.showMessageDialog(null, output, "Matrix", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/*
	 * Constructs a 2D array adding a "+" to positive values
	 */
	public static String constructPrintMod2DArray(int[][] twoDArray) {
		
		//initialize output
		String output = "";
		
		//construct output 
		for (int rLoop = 0; rLoop < twoDArray.length; rLoop++) {
			output = output + "|";
			for (int cLoop = 0; cLoop < twoDArray[rLoop].length; cLoop++){
				if(twoDArray[rLoop][cLoop] > 0) {
					output = output + String.format("+%-7d|", twoDArray[rLoop][cLoop]);
				} else {
				output = output + String.format("%-7d|", twoDArray[rLoop][cLoop]);
				}
			}//end second for loop
			output = output + "\n";
		}//end first for loop
		
		return output;
	}
	
	/*
	 * Construct the print of Averages, requires to state if its the rows or columns
	 */
	public static String constructPrintAverage(float[] arrayOfAverages, String isRowOrCol) {
		
		//initialize output
		String output = "";
		int positionNum = 1;
		
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
	
	/*
	 * Construct all the gathered information
	 */
	public static String constructPrintAll(int[][] twoDArrayBak, float[] rowAverages, float[] colAverages, float averageOfAllInArray, int rowPos, int colPos, int[][] twoDArray, int[] valCounts) {
		//construct output
		String output;
		String isRow = "Row"; //used to state if we are constructing output about rows
		String isCol = "Column"; //used to state if we are constructing output about rows
		output = "2D array based on the users input number of Rows and Columns with randomly generated numbers\nNOTE: Odd rows have odd numbers only and Even Rows have Even numbers only:\n"
				+ constructPrint2DArray(twoDArrayBak) +"\n"
				+ "The average of each row and column is:\n"
				+ constructPrintAverage(rowAverages, isRow) +"\n"
				+ constructPrintAverage(colAverages, isCol) +"\n"
				+ String.format("The average of all Values in the 2D array is: %.1f\n\n", averageOfAllInArray)
				+ "The second largest average of the rows is located in row " +rowPos +"\n"
				+ "The second largest average of the columns is located in column " +colPos +"\n\n"
				+ constructPrintMod2DArray(twoDArray) +"\n"
				+ "Number of cells in the matrix containing the values -1, +1 and 0:\n"
				+ constructPrintValueCounts(valCounts);
		
		
		//print output
		return output;
	}//end printAll
	
}//end class





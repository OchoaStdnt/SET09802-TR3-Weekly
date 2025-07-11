//need to add javadoc info

package courseWork1;

import javax.swing.JOptionPane;
import java.util.Random;

public class MatrixOps {

	public static int getRows(int minRows, int maxRows) { 
		//variables
		int validRows;
		JOptionPane.showMessageDialog(null, "You will need to enter a number for Rows");
		validRows = promptAndValidate(minRows, maxRows);
		
		return validRows;
		
	}//end getRows
	
	
	public static int getCols(int minCols, int maxCols) { 
		//variables
		int validCols;
		JOptionPane.showMessageDialog(null, "You will need to enter a number for Columns");
		validCols = promptAndValidate(minCols, maxCols);
		
		return validCols;
		
	}//end getRows
	
	
	public static int promptAndValidate(int minNum, int maxNum) {
		
		//variables
				String inputToParse;
				int userInput = 0; //this will store the value of the user
				boolean validateInt = false;
				
				
				while(validateInt == false) { //this loop will check if the string has an Integer when parsing
				
					try {	
					//prompt user for input
					inputToParse = JOptionPane.showInputDialog("Please enter a number between "+minNum+" and "+maxNum);
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
	
	public static void populateArray(int[][] array) {
		
		//initiate Random generator
		Random GenNum = new Random();
		
		//populate array with random numbers. odd rows will have only odd numbers and even rows will have only even numbers
		for(int rLoop = 0; rLoop < array.length; rLoop++) {
			
			for(int cLoop = 0; cLoop < array[rLoop].length; cLoop++) {
				//variable to store random number
				int rNum;
				
				//check if row is even or odd
				if (rLoop % 2 == 0) { //checks for even numbers. anything that is divided by 2 and gives a reminder of 0 is an even number
					rNum = GenNum.nextInt(501) * 2; //this generates even Numbers
					
				}else {
					rNum = GenNum.nextInt(500) * 2 + 1; //this generates odd Numbers
				}
				
				//= GenNum.nextInt(1000); //generate a random number between 0-1000
				array[rLoop][cLoop] = rNum;
			}//end second for loop
			
		}//end first for loop
		
	}//end populateArray
	
	public static void getAverageRows(int[][] array, int[] array2) {
		
		//variables
		int sumOfValues = 0;
		int averageOfValues;
		
		for(int rLoop = 0; rLoop < array.length; rLoop++) {
			for(int cLoop = 0; cLoop < array[rLoop].length; cLoop++) {
				sumOfValues = sumOfValues + array[rLoop][cLoop];
				
			}
			averageOfValues = sumOfValues / array[0].length; //divide by number of columns
			array2[rLoop] = averageOfValues;
			sumOfValues = 0; //reset sum of values for use in second loop
		}//end first for loop
		
	}//end getAverageRows
	
	public static void getAverageColumns(int[][] array, int[] array2) {
		
		//variables
		int sumOfValues = 0;
		int averageOfValues;
		
		for(int cLoop = 0; cLoop < array[0].length; cLoop++) {
			for(int rLoop = 0; rLoop < array.length; rLoop++) {
				sumOfValues =  sumOfValues + array[rLoop][cLoop];
			}//end second for loop
			averageOfValues = sumOfValues / array.length; //divide by number of rows
			array2[cLoop] = averageOfValues;
			sumOfValues = 0; //reset sum of values for use in second loop
		}//end first for loop
		
	}//end getAverageColumns
	
	public static int getAverageOfArray(int[][] array) {
		//variables
		int sumOfValues = 0;
		int numOfValues = 0;
		int averageOfValues;
		
		for(int rLoop = 0; rLoop < array.length; rLoop++) {
			for(int cLoop = 0; cLoop < array[rLoop].length; cLoop++) {
				sumOfValues = sumOfValues + array[rLoop][cLoop];
				numOfValues++; //keep count of values being added
			}//end second loop
		}//end first for loop
		averageOfValues = sumOfValues / numOfValues;
		return averageOfValues;
	}//end getAverageOfArray
}//end class
















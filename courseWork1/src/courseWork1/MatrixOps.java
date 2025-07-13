//need to add javadoc info

package courseWork1;

import javax.swing.JOptionPane;
import java.util.Random;

public class MatrixOps {

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
	
	public static void copy2DArray(int[][] originalArray, int[][] bakOfArray) {
		
		for(int rLoop = 0; rLoop < originalArray.length; rLoop++) {
			for(int cLoop = 0; cLoop < originalArray[rLoop].length; cLoop++) {
				bakOfArray[rLoop][cLoop] = originalArray[rLoop][cLoop];
			}//end second for loop
		}//end first for loop
		
	}//end copy2DArray
	
	
	
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
	
	
	public static int getSecondLargest(float[] array) {
		
		float maxValue = 0;
		float secondMaxValue = 0;
		int colNumber = 0;
		
		for(int loop = 0; loop < array.length; loop++) {
			if (array[loop] > maxValue) {
				secondMaxValue = maxValue;
				maxValue = array[loop];
			}else if (array[loop] > secondMaxValue && array [loop] != maxValue) { //using else if to validate two conditions
				secondMaxValue = array[loop];
			}
		}//end for loop
		System.out.print("\nSecond largest = "+secondMaxValue+"\n");
		//find the colNumber
		for(int loop = 0; loop < array.length; loop++) {
			if (array[loop] == secondMaxValue) {
				colNumber = loop;
			}
		}
		
		return colNumber + 1; //adds 1 to state the column number
	
	}//end getRowSecondLargest
	
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
	
	
	
	
	
	//print a 2DArray
	public static void print2DArray(int[][] twoDArray) {
		
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
		
		JOptionPane.showMessageDialog(null, output, "Matrix", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Print 2dArray that includes "+: sign with JOptionPane
		public static void printMod2DArray(int[][] twoDArray) {
			
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
				}
				output = output + "\n";
			}//end first for loop
			
			JOptionPane.showMessageDialog(null, output, "Modified Matrix", JOptionPane.INFORMATION_MESSAGE);
		}
	
	
	/*
	//referece for stting output
	//output construction start
			output = "Tax for each salary:\n";
			output = output + String.format("%-20s\t\t%-20s\n", "Salary", "Salary Tax");		
			
			for(int loop = 0; loop < A_SIZE; loop++) {
				salary[loop] = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary"));
				salaryTax[loop] = salary[loop] * taxRate;
				output = output + String.format("%-20.2f\t\t%-20.2f\n", salary[loop], salaryTax[loop]);
			}
			//print Salaries and taxes
			JOptionPane.showMessageDialog(null, output, "contents", JOptionPane.INFORMATION_MESSAGE);
	*/
	
}//end class
















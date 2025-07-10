package courseWork1;

import javax.swing.JOptionPane;

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
				
				return userInput + 1; //adding one for the extra row/column for calculations
		
	}//end promptAndValidate
	
	
	
}//end class

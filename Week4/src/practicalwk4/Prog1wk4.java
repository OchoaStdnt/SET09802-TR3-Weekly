/*
 * Write a program that reads 5 numbers into an array and prints out the value of each number that has a value less than 10.
 */
package practicalwk4;
import javax.swing.JOptionPane;

public class Prog1wk4 {
	public static void main(String[] args) {
		//variables and arrays
		String output;
		int checkValue = 10;
		boolean foundValue = false;
		
		final int ARRAY_SIZE = 5;
		int[] valuesEntered = new int[ARRAY_SIZE];
		
		//start constructing output
		output = "Values less than " +checkValue +" are:\n";
		
		for(int loop = 0; loop < valuesEntered.length; loop ++) { //this will loop 5x since the array size is 5 for valuesEntered
			//add each value to array starting from address 0
			valuesEntered[loop] = Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer:"));
			
			//check if value is less than 10 then add the value to the output
			if(valuesEntered[loop] < checkValue) {
				output = output +valuesEntered[loop] +"\n";
				foundValue = true;
			}
		}
		
		if(foundValue == false) {
			output = "There are no values less than " +checkValue +".";
		}
		
		//print output
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}//end main

}//end class

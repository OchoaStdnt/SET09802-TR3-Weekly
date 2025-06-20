/*
 * DESCRIPTION
 * Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers
 * 
 * in this case will ask user to enter 10 random numbers
*/

package practicalwk2;

import javax.swing.JOptionPane;

public class Prog6v2 {

	public static void main(String[] args) {
		// variables
		int inpValue, maxValue, minValue;
		String output = "";
		
		//prompt user for value and parse
		inpValue = Integer.parseInt(JOptionPane.showInputDialog("You will be asked to enter 10 numbers, \n 2Enter the first Number:"));
		maxValue = inpValue;
		minValue = inpValue;
		output = output + "Number: " +inpValue +"\n";
		
		for(int count= 0; count < 9; count++) {
			inpValue = Integer.parseInt(JOptionPane.showInputDialog("Enter another Number"));
			
			output = output + "Number: " +inpValue +"\n";
			
			
			if(inpValue > maxValue) {
				maxValue = inpValue;
			}
			if(inpValue < minValue) {
				minValue = inpValue;
			}
		}
		output = output + "The largest number entered from the list is : " +maxValue +"\n"
				+ "The smallest number entered from the list : " +minValue;
		
		//print message out
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

/*
 * DESCRIPTION
 * Write a program that inputs a series of 10 numbers and determines and prints the largest of the numbers and the smallest of the numbers
 * 
 * in this case will generate 10 random numbers from 0 - 1000
*/

package practicalwk2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Prog6 {

	public static void main(String[] args) {
		// variables
		int genValue, maxValue, minValue;
		String output = "";
		Random numGenerator = new Random();		
		
		//generate the first value for min and max
		genValue = numGenerator.nextInt(1000);
		maxValue = genValue;
		minValue = genValue;
		output = output + "Number: " +genValue +"\n";
		
		for(int count= 0; count < 9; count++) {
			genValue = numGenerator.nextInt(1000);
			//inpValue = Integer.parseInt(JOptionPane.showInputDialog("Provide a number"));
			
			output = output + "Number: " +genValue +"\n";
			
			
			if(genValue > maxValue) {
				maxValue = genValue;
			} else if(genValue < minValue) {
				minValue = genValue;
			}
		}
		output = output + "The largest number from the list is : " +maxValue +"\n"
				+ "The smallest number from the list : " +minValue;
		
		//print message out
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

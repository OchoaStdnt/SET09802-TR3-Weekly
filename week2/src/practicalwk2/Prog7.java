/*
 * DESCRIPTION
 * Write a program that inputs 10 student's marks. 
 * At the end, the program should print a message saying how many 
 * students have passed and how many students have failed. 
 * The pass mark is 50%
 */

package practicalwk2;

import javax.swing.JOptionPane;

public class Prog7 {

	public static void main(String[] args) {
		// variables
		int gradeInput;
		int stdntFailed = 0;
		int stdntPassed = 0;
		
		//tell user what will be asked
		JOptionPane.showMessageDialog(null, "You will be asked to enter 10 grades.", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
		
		
		for(int count = 0; count < 10; count++) {
			gradeInput = Integer.parseInt(JOptionPane.showInputDialog("Enter Grade:"));
			 
			if(gradeInput >= 50) {
				stdntPassed++;
			} else {
				stdntFailed++;
			}
		}
		
		//print message out with results
		JOptionPane.showMessageDialog(null, "Number of Students that passed is: " +stdntPassed +"\nNumber of Students that failed is : " +stdntFailed, "RESULTS", JOptionPane.INFORMATION_MESSAGE);
	}

}

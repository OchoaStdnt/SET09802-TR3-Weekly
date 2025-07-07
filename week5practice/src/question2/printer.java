/*
 * Using a class, write a method called printInteger() that takes an integer as an argument and prints the integer. 
 * Write a program to demonstrate your method being called from main().
 */

package question2;

import javax.swing.JOptionPane;

public class printer {
	public static void printInteger(int aNum) {
		JOptionPane.showMessageDialog(null, aNum, "Entered Number", JOptionPane.INFORMATION_MESSAGE);
		
	} //end printInteger
}//end printer class

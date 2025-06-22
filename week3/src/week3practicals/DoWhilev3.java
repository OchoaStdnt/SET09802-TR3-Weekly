/*
 * This program will double a number until a user has finished.
 */

package week3practicals;

import javax.swing.JOptionPane;

public class DoWhilev3 {

	public static void main(String[] args) {
		// variables
		String output;
		int anotherGo;
		int number = 1;
		
		do {
		number = number * 2;
		
		output = +number +"\n\nDo you want to double the number?";
		
		anotherGo = JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);
		
		} while (anotherGo == 0);	//0 is No a, yes would be 1
	}

}

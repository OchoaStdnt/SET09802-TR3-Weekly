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
		
		do {
		//display message
		JOptionPane.showMessageDialog(null, "Hello", "", JOptionPane.INFORMATION_MESSAGE);
		
		output = "Do you want to see the message again?";
		anotherGo = JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);
		
		} while (anotherGo == 0);	//0 is No a, yes would be 1
	}

}

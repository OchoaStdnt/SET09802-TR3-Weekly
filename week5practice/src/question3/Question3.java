/*
 * Using a class, write a method called addFiveToInteger() that takes an integer as an 
 * argument and returns the integer increased by five. Write a program to demonstrate your method
 *  being called from main().
 */
package question3;

import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		//variables
		int plusFive;
		//prompt for integer
		int numberInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
		
		//add five to the entered number
		plusFive = MathMethods.addFiveToInteger(numberInput);
		
		JOptionPane.showMessageDialog(null, plusFive, "The entered number plus Five", JOptionPane.INFORMATION_MESSAGE);

	}// end main

}//end class

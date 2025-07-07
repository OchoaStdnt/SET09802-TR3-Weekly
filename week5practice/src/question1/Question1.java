/*
 * Using a class, write a method called welcome() that takes no arguments but prints a welcome message on the screen.
 *  Write a program to demonstrate your method being called from main().
 */

package question1;

import javax.swing.JOptionPane;

public class Question1 {

	public static void main(String[] args) {
		// call method
		welcome(); //calls method within the same class
		WelcomeMethods.welcome2(); //calls method from an external class file
	}//end main

	public static void welcome() {
		JOptionPane.showMessageDialog(null, "Hello World!!!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
	}
	
}//end class

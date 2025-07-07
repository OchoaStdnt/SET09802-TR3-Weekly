/*
 * Using a class, write a method called printInteger() that takes an integer as an argument and prints the integer. 
 * Write a program to demonstrate your method being called from main().
 */
package question2;

import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		//ask for number and parse into an int
		 int numberInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer"));
		 
		 
		 //print the entered Integer from a method in a separate Class file.
		 printer.printInteger(numberInput);

	}// end main

}// end class Question2

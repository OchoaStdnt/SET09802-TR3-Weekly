/*
 * Using a single class, write a method addTogether() which takes three integers
 * adds them together and returns the result.  In the same class write a method called 
 * addTogether() which takes three doubles adds them together and returns the result. 
 * In the same class write a method called addTogether() which takes three Strings, 
 * joins them together and returns a string.  The method signatures for each of the methods 
 * are shown below.
 *
 * Demonstrate each of the methods being used.
 *
 * int addTogether(int, int, int);
 * double addTogether(double, double, double);
 * String addTogether(String, String, String);
 */
package question7;

import javax.swing.JOptionPane;

public class Question7 {

	public static void main(String[] args) {
		//variables
		int integerTotals;
		double doubleTotals;
		String stringsTogether, output;
		
		//using simple variables and elements to call methods (this is for ease of test)
		integerTotals = Q7Methods.addTogether(1, 2, 3); //gives total of 6
		doubleTotals = Q7Methods.addTogether(1.25, 2.25, 3.25); // gives total of 6.75
		stringsTogether = Q7Methods.addTogether("this ", " is ", " String");
		
		//construct output
		output = "Added integers = " +integerTotals +"\n"
				+"Added floats = " +doubleTotals +"\n"
				+"Added Strings = " +stringsTogether;
		
		//print output
		JOptionPane.showMessageDialog(null, output, "result for Queston 7", JOptionPane.INFORMATION_MESSAGE);

	}//end main

}//end class

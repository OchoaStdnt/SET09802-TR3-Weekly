/*
 * Using a class, write a method called calculateGrade() that takes a student’s mark (an integer) 
 * and returns their grade (a char). Validate the mark entered to ensure that it is in the range 0 to 100. 
 * Use a variable inside the method to hold the answer before returning it. Write a program to 
 * demonstrate your method being called from main().
 * 
 * Mark			Grade
 * 75-100		A
 * 60-74		B
 * 50-59		C
 * 0-49			F
 */
package question4;

import javax.swing.JOptionPane;

public class Question4 {

	public static void main(String[] args) {
		// variables
		boolean correctInt = false;
		String output, stringToParse;
		int stdntGrade = 0;
		int minGrade = 0;
		int maxGrade = 100;
		char gradeValue;
		
		while(correctInt == false) {
			
			try {
				stringToParse = JOptionPane.showInputDialog("Enter your grade");
				
				Q4Methods.exitCode(stringToParse); //check if user clicks Cancel
				stdntGrade = Integer.parseInt(stringToParse);
				
				while(stdntGrade < minGrade || stdntGrade > maxGrade) {
					stringToParse = JOptionPane.showInputDialog("Your grade must be between " +minGrade +" and " +maxGrade);
					Q4Methods.exitCode(stringToParse); //check if user clicks cancel
					stdntGrade = Integer.parseInt(stringToParse);
				}
				correctInt = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Enter a whole number", "Try Again", JOptionPane.INFORMATION_MESSAGE);
			}
		}	
		
		gradeValue = Q4Methods.calculateGrade(stdntGrade);
		
		output = "Your overall score is " +gradeValue;
		
		JOptionPane.showMessageDialog(null, output, "Your Grade", JOptionPane.INFORMATION_MESSAGE);		
	}//end main

}//end class

/*
 * Modify question 2 so that all marks must be between 0 and 100 inclusive.  
 * For each input, if the mark entered is outside this range keep 
 * looping until the user enters a correct value (i.e validate the input).
 * COMPLETED
 */

package practicalwk3;

import javax.swing.JOptionPane;

public class Prog3 {

	public static void main(String[] args) {
		// variables
				int gradeInput;
				int stdntFailed = 0;
				int stdntPassed = 0;
				int minGrade = 1;
				int maxGrade = 100;
				
				//tell user what will be asked
				JOptionPane.showMessageDialog(null, "You will be asked to enter 10 grades.", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
				
				
				for(int count = 0; count < 10; count++) {
					
					gradeInput = Integer.parseInt(JOptionPane.showInputDialog("Enter Grade:"));
					
					//validates that entered number is not less than 1 or more than 100
					while(gradeInput < minGrade || gradeInput > maxGrade) {	
						gradeInput = Integer.parseInt(JOptionPane.showInputDialog("Grade must be between " +minGrade +" and " +maxGrade));
					}
					 
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
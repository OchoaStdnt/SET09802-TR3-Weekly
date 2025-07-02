/*
 * Write a program to read in 10 student's marks (integers between 0 and 100). Store the results in an integer array. 
 * The program should print out the frequency of the grades achieved. 
 * The program should also validate the marks as they are entered.
 */
package practicalwk4;
import javax.swing.JOptionPane;

public class Prog3wk4 {

	public static void main(String[] args) {
		//variables and arrays
		String output;
		
		int minGrade = 0;
		int maxGrade = 100;
		
		final int GRADERANGE_SIZE = 4; 
		char[] gradeLabels = {'A', 'B', 'C', 'D'}; //represents 0=A (75-100), 1=B (60-74), 2=C (50-59), 3=D (0-49)
		int[] gradeFrequency =  new int[GRADERANGE_SIZE];
		
		final int A_SIZE = 10;
		int[] stdntGrades = new int[A_SIZE];
		
		//start output construction
		output = "Frequency of Grades:\n" 
		+String.format("%-20s\t\t%-20s\n", "Grade", "Frequency");
			
		for(int loop = 0; loop < stdntGrades.length; loop++) {
			stdntGrades[loop] = Integer.parseInt(JOptionPane.showInputDialog("Enter Grade:"));
			
			//validate the grade is between 0 to 100
			while(stdntGrades[loop] < minGrade || stdntGrades[loop] > maxGrade) {
				stdntGrades[loop] = Integer.parseInt(JOptionPane.showInputDialog("You entered an incorrect value.\n"
						+ "Please enter a number between " +minGrade +" and " +maxGrade));
			}//end while loop
			
			//add count for frequency
			if(stdntGrades[loop] >= 75) {
				gradeFrequency[0]++; //adds to the range of A
			}else if(stdntGrades[loop] >= 60) {
				gradeFrequency[1]++; //adds to the range of B
			}else if(stdntGrades[loop] >= 50) {
				gradeFrequency[2]++; //adds to the range of C
			}else {
				gradeFrequency[3]++; //adds to the range of D
			}
		}//end for loop
		
		//finish constructing output for frequency
		for(int loop = 0; loop < gradeLabels.length; loop++) {
			output = output + String.format("%-20s\t\t%-20d\n", gradeLabels[loop], gradeFrequency[loop]);			
		}
		
		//print output
		JOptionPane.showMessageDialog(null, output, "Grades", JOptionPane.INFORMATION_MESSAGE);
		
		
		

	}//end main

}//end class

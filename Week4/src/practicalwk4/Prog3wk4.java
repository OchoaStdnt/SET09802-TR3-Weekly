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
		/*
		int gradeA = 0; //75-100
		int gradeB = 0; //60-74
		int gradeC = 0; //50-59
		int gradeD = 0; //0-49
		*/
		int minGrade = 0;
		int maxGrade = 100;
		
		final int GRADERANGE_SIZE = 4; //represents 0=A, 1=B, 2=C, 3=D
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
			if(stdntGrades[loop] >= 75 && stdntGrades[loop] <= 100) {
				//gradeA++;
				gradeFrequency[0]++; //adds to the range of A
			}
			if(stdntGrades[loop] >= 60 && stdntGrades[loop] <= 74) {
				//gradeB++;
				gradeFrequency[1]++; //adds to the range of B
			}
			if(stdntGrades[loop] >= 50 && stdntGrades[loop] <= 59) {
				//gradeC++;
				gradeFrequency[2]++; //adds to the range of C
			}
			if(stdntGrades[loop] >= 0 && stdntGrades[loop] <= 49) {
				//gradeD++;
				gradeFrequency[3]++; //adds to the range of D
			}
		}//end for loop
		
		//finish constructing output for frequency
		output = output + String.format("%-20s\t\t%-20d\n", "A", gradeFrequency[0]) //changed "gradeA" to "gradeFrequency[0]"
		+ String.format("%-20s\t\t%-20d\n", "B", gradeFrequency[1]) //changed "gradeA" to "gradeFrequency[1]"
		+ String.format("%-20s\t\t%-20d\n", "C", gradeFrequency[2]) //changed "gradeA" to "gradeFrequency[2]"
		+ String.format("%-20s\t\t%-20d\n", "D", gradeFrequency[3]); //changed "gradeA" to "gradeFrequency[3]"
		
		//print output
		JOptionPane.showMessageDialog(null, output, "Grades", JOptionPane.INFORMATION_MESSAGE);
		
		
		

	}//end main

}//end class

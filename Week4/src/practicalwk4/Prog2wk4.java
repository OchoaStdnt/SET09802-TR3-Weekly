/*
 * Write a program to read in 5 people’s salaries and work out the tax to be paid (at 25%) for each salary.
 */
package practicalwk4;
import javax.swing.JOptionPane;

public class Prog2wk4 {

	public static void main(String[] args) {
		//variables and arrays
		String output;
		double taxRate = 0.25;
		
		final int A_SIZE = 5;
		double[] salary = new double[A_SIZE];
		double[] salaryTax = new double[A_SIZE];

		//output construction start
		output = "Tax for each salary:\n";
		output = output + String.format("%-20s\t\t%-20s\n", "Salary", "Salary Tax");		
		
		for(int loop = 0; loop < A_SIZE; loop++) {
			salary[loop] = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary"));
			salaryTax[loop] = salary[loop] * taxRate;
			output = output + String.format("%-20.2f\t\t%-20.2f\n", salary[loop], salaryTax[loop]);
		}
		//print Salaries and taxes
		JOptionPane.showMessageDialog(null, output, "contents", JOptionPane.INFORMATION_MESSAGE);
		
	}//end main

}//end class

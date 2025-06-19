package practicalwk2;

import javax.swing.JOptionPane;

public class Prog1 {

	public static void main(String[] args) {
		// variables
		int numOne, numTwo, sumValue, multipliedValue;
		String output;
		
		//prompt for numbers and parse
		numOne = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
		numTwo = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number"));
		sumValue = numOne + numTwo;
		multipliedValue = numOne * numTwo;
		
		output = numOne +" + " +numTwo +" = " +sumValue +"\n"
			+numOne +" * " +numTwo +" = " +multipliedValue +"\n"; 
		
		//check conditions and modify output as needed.
		if(numOne != numTwo) {
			if(numOne > numTwo) {
				output = output +numOne +" is the largest number";
			} else {
				output = output +numTwo +" is the largest number";
			}
			
		} else {
			output = output + "both entered numbers are the same";
		}
		
		//print message out
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.PLAIN_MESSAGE);
	}

}

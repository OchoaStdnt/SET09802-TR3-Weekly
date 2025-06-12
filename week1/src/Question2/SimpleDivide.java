package Question2;

import javax.swing.JOptionPane;

public class SimpleDivide {

	public static void main(String[] args) {
		// variables
		int firstNum, secondNum, divideVal;
				
		String valueEntered, output;
		//String output;
				
		//Prompt user for values and store in each int
		valueEntered = JOptionPane.showInputDialog("please enter a number that will be divided");
		firstNum = Integer.parseInt(valueEntered);	//converts the entered number and stores in "firstNum"
				
		valueEntered = JOptionPane.showInputDialog("please enter second number to divide by");
		secondNum = Integer.parseInt(valueEntered); //converts the second number and stores in "firstNum"
				
		divideVal = firstNum / secondNum;
				
		//construct output
		output = firstNum +" / " +secondNum +" = " +divideVal;
				
		//print message out
		JOptionPane.showMessageDialog(null, output, "Simple divide of two integers", JOptionPane.PLAIN_MESSAGE);

	}

}

package Question3;

import javax.swing.JOptionPane;

public class FloatDivide {

	public static void main(String[] args) {
		// variables
		double firstNum, secondNum, divideVal;
		
		String valueEntered, output;
		//String output;
		
		//Prompt user for values and store in each int
		valueEntered = JOptionPane.showInputDialog("please enter a number with decimal that will be divided");
		firstNum = Double.parseDouble(valueEntered);	//converts the entered number and stores in "firstNum"
		
		valueEntered = JOptionPane.showInputDialog("please enter second number with decimal to divide by");
		secondNum = Double.parseDouble(valueEntered); //converts the second number and stores in "firstNum"
		
		divideVal = firstNum / secondNum;
		
		//construct output
		output = firstNum +" / " +secondNum +" = " +divideVal;
		
		//print message out
		JOptionPane.showMessageDialog(null, output, "Simple divide of two numbers floats/doubles", JOptionPane.PLAIN_MESSAGE);

	}

}

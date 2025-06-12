package Question1;

import javax.swing.JOptionPane; //enable special window

public class SimpleSubtract {

	public static void main(String[] args) {
		// variables
		int firstNum, secondNum, subtractVal;
		
		String valueEntered, output;
		//String output;
		
		//Prompt user for values and store in each int
		valueEntered = JOptionPane.showInputDialog("please enter a number");
		firstNum = Integer.parseInt(valueEntered);	//converts the entered number and stores in "firstNum"
		
		valueEntered = JOptionPane.showInputDialog("please enter second number");
		secondNum = Integer.parseInt(valueEntered); //converts the second number and stores in "firstNum"
		
		subtractVal = firstNum - secondNum;
		
		//construct output
		output = firstNum +" - " +secondNum +" = " +subtractVal;
		
		//print message out
		JOptionPane.showMessageDialog(null, output, "Simple Subtract of two integers", JOptionPane.PLAIN_MESSAGE);

	}

}

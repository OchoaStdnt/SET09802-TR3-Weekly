package practicalwk2;

import javax.swing.JOptionPane;

public class Prog2 {

	public static void main(String[] args) {
		// variables
		int numEntered;
		String output;
		
		//prompt for number and parse
		numEntered = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));

		if(numEntered % 2 == 0) {
			output = numEntered +" is an even number"; 
		} else {
			output = numEntered +" is an odd number";
		}
		
		//print message out
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.PLAIN_MESSAGE);
	}

}

package practicalwk2;

import javax.swing.JOptionPane;

public class Prog4 {

	public static void main(String[] args) {
		// variables
		float enteredValue, totalEarned;
		String output;
		
		//prompt user for value and parse
		enteredValue = Float.parseFloat(JOptionPane.showInputDialog("How many newspapers were delivered?"));
		
		if(enteredValue <= 100) {
			totalEarned = enteredValue * 0.10f;
		} else {
			float over100 = enteredValue - 100f;
			totalEarned = (100 * 0.10f) + (over100 * 0.15f);
		}
		
		//construct and print out message
		output = String.format("Your earnings are %.2f", totalEarned);  //the %.2f formats the totalEarned to two decimal places.
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.PLAIN_MESSAGE);
	}

}

package practicalwk2;

import javax.swing.JOptionPane;

public class Prog5 {

	public static void main(String[] args) {
		// variables
		float enteredValue, totalEarned;
		String output;
		
		//prompt user for value and parse
		enteredValue = Float.parseFloat(JOptionPane.showInputDialog("How many newspapers were delivered?"));
		
		if(enteredValue >= 101) {
			if(enteredValue >= 151) {
				float over151 = enteredValue - 150f;
				totalEarned = (100 * 0.10f) + (50 * 0.15f) + (over151 * 0.20f);
			} else {
				float over100 = enteredValue - 100f;
				totalEarned = (100 * 0.10f) + (over100 * 0.15f);
			}
			
		} else {
			totalEarned = enteredValue * 0.10f;
		}
		
		//construct and print out message
		output = String.format("Your earnings are %.2f", totalEarned);  //the %.2f formats the totalEarned to two decimal places.
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.PLAIN_MESSAGE);
	}

}

package question5;

import javax.swing.JOptionPane;

public class IncreaseByPercent {

	public static void main(String[] args) {
		// variables
		String valueEntered, output;
		double valueIncreased;
		
		//prompt user for number
		valueEntered = JOptionPane.showInputDialog("Enter a number");
		valueIncreased = Double.parseDouble(valueEntered) * 1.25; //convert the entered value and multiply it by 1.25 (25%)
		
		//construct prompt
		output = valueEntered +" increased by 25% is " +valueIncreased;

		//print output
		JOptionPane.showMessageDialog(null, output, "Value increased by 25%", JOptionPane.PLAIN_MESSAGE);
	}

}

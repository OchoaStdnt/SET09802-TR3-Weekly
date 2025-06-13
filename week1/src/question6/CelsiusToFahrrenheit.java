package question6;

import javax.swing.JOptionPane;

public class CelsiusToFahrrenheit {

	public static void main(String[] args) {
		// variables
		String inCelsius, output;
		float celToFahr;
		
		//prompt user for Celsius
		inCelsius = JOptionPane.showInputDialog("Enter a Celsius temperature value to convert to Fahrenheit");
		celToFahr = (Float.parseFloat(inCelsius) *9.0f/5.0f) + 32f;	//adding "f" after each number on the to force the values to be float instead of double

		//construct prompt
		output = inCelsius +" converted to Fahrenheit is " +celToFahr;
		
		//print output
		JOptionPane.showMessageDialog(null, output, "Celsius to Fahrenheit", JOptionPane.PLAIN_MESSAGE);
	}

}

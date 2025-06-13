package question7;

import javax.swing.JOptionPane;

public class specialCharacterSamples {

	public static void main(String[] args) {
		//variable with data
		String output = "The backlash character (\\) is easy to print\n"
				+ "The double quotes are also \"easy\" to print";
		
		//print output
		JOptionPane.showMessageDialog(null, output, "Special character Samples", JOptionPane.PLAIN_MESSAGE);

	}

}

package practicalwk2;

import javax.swing.JOptionPane;

public class Prog3 {

	public static void main(String[] args) {
		// variables
		String output, charAsString;
		char theChar;
		
		charAsString = JOptionPane.showInputDialog("please enter a character");
		theChar = charAsString.charAt(0);
		
		//construct output based on the character entered.		
		if(theChar == 'a' || theChar == 'e' || theChar == 'i' || theChar == 'o' || theChar == 'u' || theChar == 'A' || theChar == 'E' || theChar == 'I' || theChar == 'O' || theChar == 'U') {
			output = theChar +" is a vowel";
		} else {
			output = theChar +" is not a vowel";
		}

		//print message
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.PLAIN_MESSAGE);
	}

}

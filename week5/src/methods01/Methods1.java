package methods01;

import javax.swing.JOptionPane;

public class Methods1 {

	public static void main(String[] args) {
		
		printWelcomeMessage();
		//do some other things
		
	}//end main
	
	public static void printWelcomeMessage() {		//this is a method on the class
		String output = "Welcome to my program ...";
		
		//print output
		JOptionPane.showMessageDialog(null, output, "Methods", JOptionPane.INFORMATION_MESSAGE);
	}//end printWelcomeMessage

}//end class

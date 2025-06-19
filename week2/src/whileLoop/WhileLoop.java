package whileLoop;

import javax.swing.JOptionPane;

public class WhileLoop {

	public static void main(String[] args) {
		// variables
		int counter = 0;
		String output = "";	//string is being used to build string concatenation

		while(counter <= 10) {
			output = output + counter +"\n";
			counter++;
		}
		
		//display output
		JOptionPane.showMessageDialog(null, output, " ", JOptionPane.INFORMATION_MESSAGE);
	}

}

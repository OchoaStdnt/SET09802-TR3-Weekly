package week3samples;

import javax.swing.JOptionPane;

public class whileLoop {

	public static void main(String[] args) {
		// variables
		int counter = 0;
		String output = "";
		
		while(counter <= 10) {
			output = output + counter +"\n";
			counter++;
		}

		//display output
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		
	}

}

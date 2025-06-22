package week3samples;

import javax.swing.JOptionPane;

public class ForLoop {

	public static void main(String[] args) {
		// variables
		String output = "";
		
		for(int counter = 0; counter <= 10; counter++) {
			output = output + counter +"\n";
		}
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

package week3practicals;

import javax.swing.JOptionPane;

public class DoWhileLoop {

	public static void main(String[] args) {
		// variables
		String output = "";
		int counter = 0;
		
		do {
			output = output +counter +"\n";
			counter++;
		}while(counter <= 10);
		
		//display output
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

package week3samples;

import javax.swing.JOptionPane;

public class BreakAndContinue {

	public static void main(String[] args) {
		// variables
		String output = "";
		
		for(int counter = 0; counter <= 10; counter++) {
			if(counter == 5) {
				break;
				//continue;	//using continue would break the instance of the loop but re run it again.  
			}
			output = output + counter +"\n";
		}
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

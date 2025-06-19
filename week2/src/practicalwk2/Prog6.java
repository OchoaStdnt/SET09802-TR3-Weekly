package practicalwk2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Prog6 {

	public static void main(String[] args) {
		// variables
		int genValue;
		int maxValue = 0;
		int minValue = 0;
		String output = "";
		Random numGenerator = new Random();
		
		for(int count= 0; count < 10; count++) {
			genValue = numGenerator.nextInt(100);
			
			output = output + "Number: " +genValue +"\n";
			
			
			
			}
		}
		
		//display out
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

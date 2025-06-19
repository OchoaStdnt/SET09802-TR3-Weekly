package practicalwk2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Prog6 {

	public static void main(String[] args) {
		// variables
		int genValue, maxValue, minValue;
		String output = "";
		Random numGenerator = new Random();
		
		//generate started values for min and max
		genValue = numGenerator.nextInt(100);
		maxValue = genValue;
		minValue = genValue;
		
		for(int count= 0; count < 10; count++) {
			genValue = numGenerator.nextInt(100);
			
			output = output + "Number: " +genValue +"\n";
			
			
			if(genValue > maxValue) {
				maxValue = genValue;
			} else if(genValue < minValue) {
				minValue = genValue;
			}
			
			/*
			if(genValue <= minValue) {
				minValue = genValue;
			} else if (genValue >= maxValue) {
				maxValue = genValue;
			}
			*/
		}
		output = output + "The largest number from the list is : " +maxValue +"\n"
				+ "The smallest number from the list : " +minValue;
		
		//display out
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

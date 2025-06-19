package randomNumber;

import javax.swing.JOptionPane;
import java.util.Random; 

public class RandomNumber {

	public static void main(String[] args) {
		// variables
		String output;
		int num;
		Random numGenerator = new Random(); //this can be called once.
		
		for(int count = 0; count < 10; count++)	{
			num = numGenerator.nextInt(9); //specify the number to be generated that is between the said number. eg 9 would generate from 0 to 9 only
			
			output = "You got a " +num;
			
			//display output
			JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		}
		

	}

}

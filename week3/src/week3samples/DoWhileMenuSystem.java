package week3samples;
import javax.swing.JOptionPane;

public class DoWhileMenuSystem {

	public static void main(String[] args) {
		// variables
		String output, usersNumber;
		int num;
		
		do {
		//construct output
		output = "Select one of the menu options \n\n";
		
		output = output + "1 - Start Program \n";
		output = output + "2 - View Details \n";
		output = output + "3 - Exit \n";
		
		//prompt user
		usersNumber = JOptionPane.showInputDialog(output);
		//convert string to int
		num = Integer.parseInt(usersNumber);
		
		if(num == 1) {
			output = "Program has started";
			JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		}
		if(num == 2) {
			output = "Here are the details";
			JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		}
		
		} while(num != 3);
		
	}

}

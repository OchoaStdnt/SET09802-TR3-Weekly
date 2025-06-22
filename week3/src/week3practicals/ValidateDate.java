package week3practicals;

import javax.swing.JOptionPane;

public class ValidateDate {

	public static void main(String[] args) {
		// variables
		String usersNumber, output;
		int number;
		int minNumber = 5;
		int maxNumber = 200;
		
		// prompt user for a number
	    usersNumber = JOptionPane.showInputDialog("please enter a number between " +minNumber +" and " +maxNumber);

	    // convert string to integer
	    number = Integer.parseInt(usersNumber); 

	    // validate input
	    while (number < minNumber || number > maxNumber) {
	       // prompt user for a valid number
	      usersNumber = JOptionPane.showInputDialog("You entered an incorrect value.\n"
	      		+ "Please enter a number between " +minNumber +" and " +maxNumber); 

	      // convert string to Integer
	      number = Integer.parseInt(usersNumber);
	    } // end while loop
	    
	    //construct ouptut
	    output = "You entered " +number;
	    
	    //display out
	    JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
	}

}

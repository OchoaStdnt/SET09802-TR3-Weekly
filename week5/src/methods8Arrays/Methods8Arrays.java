package methods8Arrays;

import javax.swing.JOptionPane;

public class Methods8Arrays {

	public static void main(String[] args) {
		// variables
		String output;
		int[] usersData;
		
		//get users data
		usersData = readUsersData();
		
		output = "Users Data: \n";
		for(int loop = 0; loop < usersData.length; loop++) {
			output = output +usersData[loop] + "  ";
		}
		
		//display the array
		JOptionPane.showMessageDialog(null, output, "methods 8", JOptionPane.INFORMATION_MESSAGE);
		
	}//end main

	
	public static int[] readUsersData() {
		//variables
		String numString;
		
		final int ARRAY_SIZE = 5;
		int[] theArray = new int[ARRAY_SIZE];
		
		for(int loop = 0; loop < theArray.length; loop++) {
			numString = JOptionPane.showInputDialog("Please enter an integer");
		    theArray[loop] = Integer.parseInt(numString);
		}
		
		return theArray;
		
	}//end readUsersData
	
	
	
}//end class

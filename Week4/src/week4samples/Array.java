package week4samples;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		//variables
		String output, aNum;
		int num;
		final int ARRAY_SIZE = 3; //this creates the array size. the "final" means the variable will is locked and cannot be changed. Capital letters is used for the variable to specify that it will never change.
		
		//array
		int[] usersNumbers= new int[ARRAY_SIZE]; 
		
		//loop. loops are great for arrays
		for(int loop = 0; loop < usersNumbers.length; loop++) {		//the "usersNumbers.length" = 3. this is using the number 3 since its the size of the array.
			//ask user for number and convert to integer
			aNum = JOptionPane.showInputDialog("Please enter an integer");
			num = Integer.parseInt(aNum);
			
			//can also use the below
			//num = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer"));
			
			//store int in array
			usersNumbers[loop] = num; //using the variable "loop" since it starts with 0 and will increase on each run, populating the array. 
		}
		
		//construct output
		output = "You entered:\n";
		for(int loop = 0; loop < usersNumbers.length; loop++) {
			output = output + usersNumbers[loop] +"\n";
		}
		
		//print output
		JOptionPane.showMessageDialog(null, output, "array", JOptionPane.INFORMATION_MESSAGE);

	}//end main

}//end class


/*
 * Changing the ARRAY_SIZE would change the whole program without the need of changing all the loops to run based on the
 * length of the array
 */




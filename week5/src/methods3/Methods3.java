package methods3;

import javax.swing.JOptionPane;

public class Methods3 {

	public static void main(String[] args) {
		// variables
		String ageAsString;
		int age;
		
		//read in age
		ageAsString = JOptionPane.showInputDialog("Please enter your age");
		age = Integer.parseInt(ageAsString);
		
		//call method to print message
		printAge(age);		
		
	}//end main

	
	public static void printAge(int anAge) { //this method needs an int and names it anAge to be used.
		String output;
		
		output = "You are " +anAge +" years old.";
		JOptionPane.showMessageDialog(null, output, "methods 3", JOptionPane.INFORMATION_MESSAGE);
	}//end printAge
	
	
}//end class

package methods5;

import javax.swing.JOptionPane;

public class Methods5 {

	public static void main(String[] args) {
		// variables
		String ageAsString, name;
		int age;
		
		//ask user for details
		ageAsString = JOptionPane.showInputDialog("Please enter your age");
		age = Integer.parseInt(ageAsString);
		name = JOptionPane.showInputDialog("please enter your name");
		
		printDetails(name, age);

	}//end main
	
	
	public static void printDetails(String aName, int anAge) {
		String output;
		output = aName +" is " +anAge +" years old";
		JOptionPane.showMessageDialog(null, output, "methods 5", JOptionPane.INFORMATION_MESSAGE);
	}

}//end class

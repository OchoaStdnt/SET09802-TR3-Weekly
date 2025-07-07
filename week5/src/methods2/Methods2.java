package methods2;

import javax.swing.JOptionPane;

public class Methods2 {

	public static void main(String[] args) {
		//variables
		String output;
		int yourAge;
		
		//call method
		yourAge = readAge();
		
		//print message
		output = "you are " +yourAge +" years old";
		JOptionPane.showMessageDialog(null, output, "Methods2", JOptionPane.INFORMATION_MESSAGE);

		
		
	}//end main
	
	
	//method to read age
	public static int readAge() {
		//variables
		String ageAsString;
		int age;
		
		//read in age
		ageAsString = JOptionPane.showInputDialog("Please enter your age");
		//convert to int
		age = Integer.parseInt(ageAsString);
		
		return age; //this returns the int since we said we gona return an in in the "public static int" 
	
	}//end readAge
	

}//end class

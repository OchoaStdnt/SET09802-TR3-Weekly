package methods4;

import javax.swing.JOptionPane;

public class Methods4 {

	public static void main(String[] args) {
		// variables
		String output, ageAsString;
		int age, ageNextYear;
		
		ageAsString = JOptionPane.showInputDialog("Please enter your age");
		age = Integer.parseInt(ageAsString);
		
		ageNextYear = addOne(age);
		
		output = "You will be " +ageNextYear +" on your next birthday";
		JOptionPane.showMessageDialog(null, output, "methods 4", JOptionPane.INFORMATION_MESSAGE);

	}//end main
	
	
	public static int addOne(int anAge) { //this take in a variable and returns a variable. in this case an int.
		return anAge + 1;
	}
	
	

}//end class

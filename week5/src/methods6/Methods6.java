package methods6;

import javax.swing.JOptionPane;

public class Methods6 {

	public static void main(String[] args) {
		// variables
		String num1AsString, num2AsString, output;
		int num1, num2, total;
		
		//read in number 1 and convert to int
		num1AsString = JOptionPane.showInputDialog("Please enter an integer");
		num1 = Integer.parseInt(num1AsString);
		
		//read in number 1 and convert to int
		num2AsString = JOptionPane.showInputDialog("Please enter an integer");
		num2 = Integer.parseInt(num2AsString);
		
		total = add(num1, num2);
		
		output = num1 +" + " +num2 +" = " +total;
		JOptionPane.showMessageDialog(null, output, "Methods 6", JOptionPane.INFORMATION_MESSAGE);

	}//end main
	
	
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}// end add
	
	

}//end class

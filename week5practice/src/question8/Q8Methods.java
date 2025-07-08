package question8;

import javax.swing.JOptionPane;

public class Q8Methods {
	
	//prints name, address and age
	public static void printDetails(String name, String addr, int age) {
		//build output		
		String output = "Printing name, address and age:\n"
				+name +", " +addr +", " +age;
		//print output
		JOptionPane.showMessageDialog(null, output, "Name, Address, Age", JOptionPane.INFORMATION_MESSAGE);
	}//end printDetails(String, String, int);
	
	//prints name, address
	public static void printDetails(String name, String addr) {
		//build output		
		String output = "Printing name and address:\n"
				+name +", " +addr;
		//print output
		JOptionPane.showMessageDialog(null, output, "Name, Address", JOptionPane.INFORMATION_MESSAGE);
	}//end printDetails(String, String);
	
	//prints name, age
	public static void printDetails(String name, int age) {
		//build output		
		String output = "Printing name and age:\n"
				+name +", " +age;
		//print output
		JOptionPane.showMessageDialog(null, output, "Name, Age", JOptionPane.INFORMATION_MESSAGE);
	}//end printDetails(String, int);
	
	
	//prints address and age
	//this can only be done by 2 ways. either rename the method or change the order of the String and int
	//methods name can have the same name once the parameters are in different order.
	public static void printDetails(int age, String addr) {
		//build output		
		String output = "Printing address and age:\n"
				+addr +", " +age;
		//print output
		JOptionPane.showMessageDialog(null, output, "Address, Age", JOptionPane.INFORMATION_MESSAGE);
	}//end printDetails(int, String);
	
	
}//end class

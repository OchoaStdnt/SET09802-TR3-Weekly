package Question4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class UserAgeAdd1 {

	public static void main(String[] args) {
		//variables
		String usrName, usrAge, oTimeDate, output;
		int age, oYear;
		
		//Fetch Date,Time and year and format for better display
		LocalDateTime now = LocalDateTime.now();
		oTimeDate = now.format(DateTimeFormatter.ofPattern("MMMM-dd hh:mm a"));
		oYear = now.getYear() + 1;
		
		//prompt user for Name and Age (age will be parsed into an integer)
		usrName = JOptionPane.showInputDialog("Enter Your Name");
		usrAge = JOptionPane.showInputDialog("Enter your Age");
		age = Integer.parseInt(usrAge);
		age++;
		
		//construct output
		output = usrName +" you will already be " +age +" years old by the year " +oYear +" on " +oTimeDate;
		
		//print message out
		JOptionPane.showMessageDialog(null, output, "Age plus 1", JOptionPane.PLAIN_MESSAGE);
		

	}

}

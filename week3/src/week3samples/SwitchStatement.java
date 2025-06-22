package week3samples;

import javax.swing.JOptionPane;

public class SwitchStatement {

	public static void main(String[] args) {
		// variables
		String usersGrade;
		String output = "";
		char grade;
		
		//prompt user for grade
		usersGrade = JOptionPane.showInputDialog("Please enterr your grade (a-f)");
		grade = Character.toLowerCase(usersGrade.charAt(0));	//edited this to convert chars to lower case. this is to avoid capital letters to the code forr the switch
		
		switch (grade) {
		case 'a':
			output = "fantastic results";
			break; //so that once the value is correct we come out of the switch
		case 'b':
			output = "great results";
			break; //so that once the value is correct we come out of the switch
		case 'c':
			output = "Very good";
			break; //so that once the value is correct we come out of the switch
		case 'd':
			output = "must do better";
			break; //so that once the value is correct we come out of the switch
		case 'e':
			output = "Poor";
			break; //so that once the value is correct we come out of the switch
		case 'f':
			output = "fail";
			break; //so that once the value is correct we come out of the switch
		default:
			output = "I did not recognize your entry";
		}//end switch

		//display output
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		
	}

}

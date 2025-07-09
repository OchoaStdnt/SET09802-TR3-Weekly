package question9;

import javax.swing.JOptionPane;

public class Q9Methods {
	
	
	
	
	
	
	
	public static void welcomeMessage() { //method 1
		
		String welcomeMessage = "Hello how are you?";
		JOptionPane.showMessageDialog(null, welcomeMessage, "Hello", JOptionPane.INFORMATION_MESSAGE);
	
	}//end welcomeMessage()
	
	
	
	
	
	
	
	
	public static int getMark(int minMark, int maxMark) { //method two
		//variables
		String message, theMark;
		int mark;
		
		//do {
			//read in marks
			message = "please enter a mark";
			theMark = JOptionPane.showInputDialog(message);
	   	   	mark = Integer.parseInt(theMark);

	   	   	//validate mark
	   	   	while (mark < minMark || mark  > maxMark) {
		   	 	message = "Please enter a mark between " +minMark +" and " +maxMark;
				theMark = JOptionPane.showInputDialog(message);
		   	   	mark = Integer.parseInt(theMark);
	   	   	}
	   	  // 	numberOfStudents--;
		   	//}while(numberOfStudents != 0);
		return mark;
		
	}//end getMark()
	
	
	
	
	
	
	
	//the passing array on this method must not have the same name as the array its referencing!!!
	public static void passFailCheck(int stndtMark, int passMark, int[] passFailCountsRef) { //method 3
		//int[] passFailResults = new int[2];  //passes will be stored on address 0 and fails on address 1
		
		if (stndtMark >= passMark) {
			passFailCountsRef[0]++;
		}else {
			passFailCountsRef[1]++;
		}
		
		//return passFailResults;
	}// end passFailcheck()
	
	
	
	
	
	
	
	public static void outputResults(int passes, int fails) { //method 4
		String output;
		output = "The number of passes is " +passes +"\n";
		output = output  + "The number of fails is " +fails;
		JOptionPane.showMessageDialog(null, output, "Hello", JOptionPane.INFORMATION_MESSAGE);
	}
	
}//end class

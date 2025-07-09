/*
 * Take the class Q9Code in this same package and redo using methods, you should use at least four methods.
 */

package question9;

public class Question9 {

	public static void main(String[] args) {
		// CODE SAMPLE BELOW
		//variables
		int numberOfStudents = 3;
		int minMark = 0;
		int maxMark = 100;
		int passMark = 10;
		int mark;
		int[] passFailCounts = new int[2]; //passes will be stored on address 0 and fails on address 1
		
		
		//call method 1
		Q9Methods.welcomeMessage();
		
		
		//loop to get marks, validad and tally fail and passes
		do {
		//call method 2
		mark = Q9Methods.getMark(minMark, maxMark);
		
		//Call method 3
		Q9Methods.passFailCheck(mark, passMark, passFailCounts);
		numberOfStudents--;
		}while (numberOfStudents != 0);
		
		//call method 4
		Q9Methods.outputResults(passFailCounts[0], passFailCounts[1]);
		
		

		

	}//end class

}//end main

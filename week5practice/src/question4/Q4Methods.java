package question4;

public class Q4Methods {
	public static char calculateGrade(int grade) {
		//variables
		char stdntOverallGrade;
		
		//check grade and assign a grade Range A, B, C, F
		if(grade >= 75) {
			stdntOverallGrade = 'A';			
		}else if (grade >= 60) {
			stdntOverallGrade = 'B';
		}else if (grade >= 50) {
			stdntOverallGrade = 'C';
		}else {
			stdntOverallGrade = 'F';
		}
		
		return stdntOverallGrade;
		
	}//end calculateGrade
	
	public static void exitCode(String vEntered) {
		if (vEntered == null) {
			System.exit(0);
		}
	}//end exitCode
	
}//end Q4Methods

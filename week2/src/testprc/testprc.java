package testprc;

public class testprc {

	public static void main(String[] args) {
	
		//declare variables
		int mark = 77;
		int passMark = 50;
		int distinctionLevel = 75;
		
		//test to see if the mark is a pass or not
		if(mark >= passMark) {
			if(mark >= distinctionLevel) {
				System.out.println("You got a distinction");
			} else {
				System.out.println("You have passed");
			}
		} else {
			System.out.println("You have failed");
		}

	}

}
